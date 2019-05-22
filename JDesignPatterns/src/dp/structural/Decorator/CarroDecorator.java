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
public class CarroDecorator implements ICarro {

    protected ICarro carro;

    public CarroDecorator(ICarro c) {
        this.carro = c;
    }

    @Override
    public void montar() {
        this.carro.montar();
    }
}
