/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.behavioral.command;

/**
 *
 * @author Usuário
 */
public class Controle {                
    
    private ICommand[] onComando;
    private ICommand[] offComando;

    public Controle() {                    // criando os slots dos botões do
                                                 // meu controle remoto
        onComando = new ICommand[4];
        offComando = new ICommand[4];
        
        ICommand semComando = new ComandoVazio();
        
        for (int i = 0; i < 4; i++) {
            onComando[i] = semComando;
            offComando[i] = semComando;
        }
    }
    
    public void setComando(int slot, ICommand onComando, ICommand offCommand){
        this.onComando[slot] = onComando;
        this.offComando[slot] = offCommand;
    }
    
    public void isPress(int slot){
        onComando[slot].Executar();
    }                                        
    
    public void isNotPress(int slot){
        offComando[slot].Executar();
    }
}
