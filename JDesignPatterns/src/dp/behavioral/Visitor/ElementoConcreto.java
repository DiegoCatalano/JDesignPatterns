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
public class ElementoConcreto extends Elemento {
    
    @Override
    public void accept(Visitor visitor){
        visitor.Visit(this);
        super.accept(visitor);
    }

    public void accept(VisitorConcreto visitorconcreto) {
        visitorconcreto.Visit(this);
        super.accept(visitorconcreto);
    }
    
    
}
