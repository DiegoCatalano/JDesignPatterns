/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.Builder;

/**
 *
 * @author joao
 */
public class CarroVermelho { 
    private final ICarroBuilder builder;

    public CarroVermelho(final ICarroBuilder builder) {
        this.builder = builder;
    }

    public Veiculo construtor() {     //usa os metodos de ICarroBuilder
        return builder.setRodas(4)
                      .setCor("Vermelho")
                      .setTipo("Carro")
                      .build();   //build do VeiculoConstructor 
    }
    
}
