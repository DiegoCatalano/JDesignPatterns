/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Luiz
 */
public abstract class Prototype {
    
    public int x;
    public int y;
    
    public Prototype (Prototype obj){
        this.x = obj.x;
        this.y= obj.y;       
    }

    public Prototype() {
    }
    
    
    
    
    public abstract Prototype clone();
    
    
}
