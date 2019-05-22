/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.AbstractFactory;

import java.math.BigDecimal;

/**
 *
 * @author bully
 */
class Produto {

    
   

    
     private BigDecimal valor;
    private String nome;
    private int quantidade;
    private double ValorTotal;
    
     BigDecimal getValorUnitario() {
        return getValor();
       
    }
    
    
    
    public BigDecimal getValor() {
        return valor;
    }

   
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getQuantidade() {
        return quantidade;
    }

   
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
   
     public double getValorTotal() {
        return ValorTotal;
    }

    
    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

  
    
}
