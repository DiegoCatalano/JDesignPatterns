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
public class DesligarLuzCozinha implements ICommand{

    private Luz luz;

    public DesligarLuzCozinha(Luz luz) {
        luz.local = "Cozinha";                  
        this.luz = luz;
    }                                       // mesma ideia da classe LigarLuzCozinha
    
    @Override
    public void Executar() {
        this.luz.Desligar();
    }
}
