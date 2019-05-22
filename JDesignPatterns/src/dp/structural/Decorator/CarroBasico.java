/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.structural.Decorator;

/**
 *
 * @author Mateus Araújo
 */
public class CarroBasico implements ICarro {

    @Override
    public void montar() {
        System.out.print("Carro básico.");
    }
}
