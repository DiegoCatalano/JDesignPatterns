
package dp.behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

public class Pescador implements Observer, Comportamento {
       
    public void beijar(){
        System.out.println("Pescador identificou um micro toque na vara!");
}
    

    public void beliscar(){
        System.out.println("Pescador segura a vara de pesca na mão!");
}
    

    public void comendo(){
        System.out.println("Pescador sente puxada forte!");
    
}
    

    public void fisgar(){
        System.out.println("Pescador trabalha o peixe!");
}

    public void cansar(){
        System.out.println("Pescador recolhe a linha e tira o peixe!");
}
    public void update(Observable arg0, Object arg1){
        Peixe peixeObservado = (Peixe)arg0;
        String acao = String.valueOf(arg1);
        
        if(acao.equals("beijar")){
            this.beijar();
        }
        else if(acao.equals("beliscar")){
            this.beliscar();
        }
        else if(acao.equals("comendo")){
            this.comendo();
        }
        else if(acao.equals("fisgar")){
            this.fisgar();
        }
        else if(acao.equals("cansar")){
            this.cansar();
        }
    }
}