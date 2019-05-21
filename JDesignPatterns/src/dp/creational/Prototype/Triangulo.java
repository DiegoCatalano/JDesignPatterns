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
public class Triangulo extends Prototype {
    
    public int z;
    public int bissetriz;
    

    public Triangulo(Triangulo obj) {
        super(obj);
        this.bissetriz = obj.bissetriz;
    }
    
    @Override
    public Prototype clone() {
        Triangulo novoTriangulo =new Triangulo(this);
        return novoTriangulo;
    }

    public Triangulo(){}
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangulo) || !super.equals(obj)) return false;
        Triangulo novoTriangulo2 = (Triangulo) obj;
        return novoTriangulo2.bissetriz == bissetriz;
    }
    
    
}
