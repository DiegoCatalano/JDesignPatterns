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
public class VisitorConcreto implements Visitor {

    @Override
    public void Visit(ElementoConcreto elementoconcreto) {
        System.out.println("Estou visitando " + elementoconcreto.getClass().getName());
    }
    
    
}
