
package dp.behavioral.Observer;

import java.util.Observer;

public class Main {
    public static void main(String[] args){
         //Observador
         Pescador pescador = new Pescador();
         
        //Observado
        Peixe peixe = new Peixe();
        
        // Adicionar o observador ao observado
        peixe.addObserver((Observer) pescador);
        
        peixe.beijar();
        peixe.beliscar();
        peixe.comendo();
        peixe.fisgar();
        peixe.cansar();
        
    }
}
