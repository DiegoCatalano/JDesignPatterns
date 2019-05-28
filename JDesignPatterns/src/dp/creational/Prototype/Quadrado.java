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
public class Quadrado extends Prototype{
    private int vertice;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }
    
    
    public Quadrado(){
    }
    
    protected Quadrado(Quadrado obj) {
        obj.vertice=this.vertice;
    }

    

    @Override
    public  Prototype clone() {
        Quadrado novoQuadrado =new Quadrado(this);
        return new Quadrado(this);
    }
    
   @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Quadrado)) {
            return false;
        }
        Quadrado novoQuadrado2 = (Quadrado) obj;
        return novoQuadrado2.vertice == vertice;
    }

}

    