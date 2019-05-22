/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.behavioral.Visitor;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author mateu
 */
public class Elementvisitor extends Visitor {
    public void visit(XmlElement xe) {
        System.out.println("processing an XML element with uuid: " + xe.uid);
    }
 
    /**
     *
     * @param je
     */
    public void visit(JsonElement je) {
        System.out.println(
          "processing a JSON element with uuid: " + je.uuid);
    }
    
}
