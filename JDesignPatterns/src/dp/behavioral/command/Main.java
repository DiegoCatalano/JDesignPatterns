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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Controle controle = new Controle();    // criando o controle
        
        Luz luzCozinha = new Luz();         // luz onde eu quero ligar
        
        controle.setComando(0, new LigarLuzCozinha(luzCozinha), new DesligarLuzCozinha(luzCozinha)); // setando uma instancia de um comando
        
        controle.isPress(0);        // presionando botão ligar no slot 0;
        System.out.println(controle);
        //controle.offPressionado(0);
        //controle.onPressionado(7);
        //controle.offPressionado(7);
        
    }
    
}
