/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.behavioral.command;

import java.io.Console;

/**
 *
 * @author Usuário
 */
public class Luz {
    
    private String local = "";           // local onde a luz está acesa

    public Luz() {
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public void Ligar(){
        System.out.printf("luz ligada: ", local);      // onde a luz está ligada
    }
    
    public void Desligar(){
        System.out.printf("luz desligada: ", local);   // onde a luz está desligada
    }
}
