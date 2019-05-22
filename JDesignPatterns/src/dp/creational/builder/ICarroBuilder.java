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
public interface ICarroBuilder {        //usado para controlar as classes
    Veiculo build();
    ICarroBuilder setCor(String cor);
    ICarroBuilder setRodas(int rodas);
    ICarroBuilder setTipo(String tipo);
    
}
