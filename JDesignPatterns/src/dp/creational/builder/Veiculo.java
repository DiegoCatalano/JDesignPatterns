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
public class Veiculo {
    private int rodas;
    private String cor;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Veiculo(){};

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Veículo, tipo = " + tipo +  " [rodas = " + rodas + ", cor = " + cor + "]";
    }   
    
}
