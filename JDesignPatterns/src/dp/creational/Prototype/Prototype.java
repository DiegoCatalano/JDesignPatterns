/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.Creational.Prototype;

/**
 *
 * @author Luiz
 */
public abstract class Prototype {
    
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Prototype (Prototype obj){
        this.x = obj.x;
        this.y= obj.y;       
    }

    public Prototype() {
    }
    
    
    
    
    public abstract Prototype clone();
    
    
}
