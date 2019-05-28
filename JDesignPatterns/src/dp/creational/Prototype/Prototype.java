/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.Prototype;

/**
 *
 * @author Luiz
 */
public abstract class Prototype {
    
    public int x;
    public int y;
    public Prototype() {
    }
    
    public Prototype (Prototype obj){
       
        this.x = obj.x;
        this.y= obj.y;
        
    }

    public abstract Prototype clone();
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Prototype) || !super.equals(obj)) {
            return false;
        }
        Prototype novoElemento = (Prototype) obj;
        return novoElemento.x == x && novoElemento.y== y;
    }
 
}
