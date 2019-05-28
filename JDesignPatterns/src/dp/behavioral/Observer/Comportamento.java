
package dp.behavioral.Observer;


public interface Comportamento { //Interface com o comportamento dos metodos
                                //implementada pelo Pescador quanto para o Peixe
   
    public void beijar(); // Peixe irá beijar a isca, pescador irá ver um micro 
                           //toque na vara 
    
    public void beliscar(); //Peixe morde a isca mas não fisga, pescador segura
                            //a vara
    
    public void comendo(); //Peixe está mastigando a isca, pescador sente 
                           //puxada forte
    
    public void fisgar(); //O anzol fisga o peixe, pescador trabalha o peixe
    
    public void cansar(); //Peixe cansou, pescador recolhe a linha e tira o
    
}
