
package dp.creational.ObjectPool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
  private long expirationTime;

  private Hashtable<T, Long> locked, unlocked;

  public ObjectPool() {
    expirationTime = 30000; // Tempo de expiração 30 segundos
    locked = new Hashtable<T, Long>();
    unlocked = new Hashtable<T, Long>();
    //locked e unlocked são exclusivos e só executam de maneira atômica. Threads que tentam pegar um lock que ja esta pego,
    //ficarão em conjunto especial esperando a liberação do lock, (não necessariamente numa fila)
  }

  protected abstract T create();

  public abstract boolean validate(T o);

  public abstract void expire(T o);
  
  // A palavra "synchronized" da a característica e recebe qual é o objeto que será usado como chave.
  // A chave so é devolvida no tempo em que a Thread que tinha essa chave sair do bloco, por um return.
  public synchronized T checkOut() { 
    long now = System.currentTimeMillis();
    T t;

    if (unlocked.size() > 0) { 
      Enumeration<T> e = unlocked.keys();
      while (e.hasMoreElements()) {
        t = e.nextElement();
        if ((now - unlocked.get(t)) > expirationTime) { // Se a chave pega for maior que o tempo de expiração, remove a chave 
          unlocked.remove(t);
          expire(t);
          t = null;
        } else { //Se não ela retorna a classe desejada
          if (validate(t)) {
            unlocked.remove(t);
            locked.put(t, now);
            return (t);
          } else {
            // Se der alguma falha na validação do objeto, remove a chave
            unlocked.remove(t);
            expire(t);
            t = null;
          }
        }
      }
    }
    // Se não tiver objetos disponíveis, cria um novo objeto
    t = create();
    locked.put(t, now);
    return (t);
  }

  public synchronized void checkIn(T t) {
    locked.remove(t);
    unlocked.put(t, System.currentTimeMillis());
  }
}