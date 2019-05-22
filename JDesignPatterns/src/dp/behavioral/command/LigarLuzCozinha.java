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
public class LigarLuzCozinha implements ICommand{

    private Luz luz;                            

    public LigarLuzCozinha(Luz luz) {       
        luz.local = "Cozinha";             // mostra que a luz onde está ligada     
        this.luz = luz;                    // é a da cozinha
    }
    
    @Override
    public void Executar() {              // sobre-escreve o metodo executar, 
        this.luz.Ligar();                 // ligando a luz
    }
}
