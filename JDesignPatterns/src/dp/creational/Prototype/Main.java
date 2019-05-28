/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Prototype> tipo1 = new ArrayList<>();
        List<Prototype> tipo2 = new ArrayList<>();

        Quadrado quadrado = new Quadrado();
        quadrado.x=10;
        quadrado.y=10;
        quadrado.setVertice(4);
        tipo1.add(quadrado);
        Quadrado novoQuadrado = (Quadrado) quadrado.clone();
        tipo1.add(novoQuadrado);
        //
       Triangulo triangulo = new Triangulo();
        triangulo.x=10;
        triangulo.y=10;
        triangulo.setZ(5);
        triangulo.setBissetriz(5);
        tipo1.add(triangulo);
        
        cloneComparacao(tipo1,tipo2);
    }
     private static void cloneComparacao(List<Prototype> tipo1, List<Prototype> tipo2) {
        for (Prototype tipo : tipo1) {
            tipo2.add(tipo.clone());
        }
        for (int i = 0; i < tipo1.size(); i++) {
            if (tipo1.get(i) != tipo2.get(i)) {
                
            System.out.println(i + " Formas geometricas diferentes");
            if ((tipo1.get(i).equals(tipo2.get(i)))) {
                System.out.println(i +  " Mas possuem o mesmo valor ");
            }else {
                System.out.println(i + " E nao possuem o mesmo valor ");
                }
            }else{
                System.out.println(i+ " As formas geometricas sao as mesmas ");
            }
        }
    }
}
