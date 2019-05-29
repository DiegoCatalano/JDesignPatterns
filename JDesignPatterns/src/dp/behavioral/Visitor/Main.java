/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.behavioral.Visitor;

/**
 *
 * @author mateu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ElementoConcreto elementoconcreto = new ElementoConcreto();
        VisitorConcreto visitorconcreto = new VisitorConcreto();
        elementoconcreto.accept(visitorconcreto);
    }
    
}
