/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.singleton;

/**
 * Singleton design pattern.
 * Some examples useful
 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 * 
 * @author Diego Catalano
 */
public class Singleton {
    
    private int attribute1;
    private int attribute2;

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
    
    private Singleton(){}
    
    /**
     * Tem que existir este para ser o singleton
     * @return 
     */
    public static Singleton getInstance(){
        return new Singleton();
    }
    
}
