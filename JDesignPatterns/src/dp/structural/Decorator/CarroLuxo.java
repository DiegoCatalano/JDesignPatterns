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
public class CarroLuxo extends CarroDecorator {

    public CarroLuxo(ICarro c) {
        super(c);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.print(" Adicionando características ao carro luxo.");
    }
}
