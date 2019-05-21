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
public class Quadrado extends Prototype{
    public int vertice;
    
    public Quadrado(){
    }
    
    public Quadrado(Quadrado obj) {
        super(obj);
        this.vertice=obj.vertice;
    }

    

    @Override
    public  Prototype clone() {
        Quadrado novoQuadrado =new Quadrado(this);
        return novoQuadrado;
    }
    
   @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Quadrado) || !super.equals(obj)) return false;
        Quadrado novoQuadrado2 = (Quadrado) obj;
        return novoQuadrado2.vertice == vertice;
    }

}

    