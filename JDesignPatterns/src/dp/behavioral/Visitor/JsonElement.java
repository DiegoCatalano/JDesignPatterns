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
class JsonElement {

    String uuid;
    String uuid;
 public void accept(Visitor v) {
        v.visit(this);
    }    
}
