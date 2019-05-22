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
public class VeiculoConstrutor implements ICarroBuilder {
    private final Veiculo veiculoTemp;

    public VeiculoConstrutor() {
        veiculoTemp = new Veiculo();
    }
    
    

    @Override
    public Veiculo build() {        //retorna um objeto do tipo Veiculo com todos os atributos setados.
        Veiculo carro = new Veiculo();
        carro.setCor(veiculoTemp.getCor());
        carro.setRodas(veiculoTemp.getRodas());
        carro.setTipo(veiculoTemp.getTipo());
        return carro;
    }

    @Override
    public ICarroBuilder setCor(String cor) {
        veiculoTemp.setCor(cor);
        return this;
    }

    @Override
    public ICarroBuilder setRodas(int rodas) {
        veiculoTemp.setRodas(rodas);
        return this;
    }

    @Override
    public ICarroBuilder setTipo(String tipo) {
        veiculoTemp.setTipo(tipo);
        return this;
    }

    
    
}
