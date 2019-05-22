package dp.behavioral.Observer;

import java.util.Observable;

public class Peixe extends Observable implements Comportamento {
    
    private String acao = "";
    

    public void beijar(){ 
        acao = "beijar";
        System.out.println("Peixe beijou a isca! ");
        this.mudaEstado();
    }
    

    public void beliscar(){
        acao = "beliscar";
        System.out.println("Peixe morde a isca mais não fisga! ");
        this.mudaEstado();
    }
    

    public void comendo(){
        acao = "comendo";
        System.out.println("Peixe mastiga a isca! ");
        this.mudaEstado();
    }
    
    @Override
    public void fisgar(){
        acao = "fisgar";
        System.out.println("Peixe capturado, o anzol fisgou o peixe ");
        this.mudaEstado();
    }
    

    public void cansar(){
        acao = "cansar";
        System.out.println("O peixe está cansado! ");
        this.mudaEstado();
    }
    
    public void mudaEstado(){
        setChanged();// Mudou o estado
        notifyObservers(acao);// Notifica observadores 
    }
    
}