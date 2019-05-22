/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.parser.Element;

/**
 *
 * @author mateu
 */
public class Document extends Element {
    List<Element> elements = new ArrayList<>();
 
    // ...
 
    public void accept(Visitor v) {
        this.elements.forEach((Element e) -> {
            e.accept(v);
        });
    }
    
}
