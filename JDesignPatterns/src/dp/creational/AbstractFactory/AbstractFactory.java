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
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Produto produto = new Produto();
        produto.setNome("Nike Shoks");
        produto.setQuantidade(1);
        produto.setValor(new BigDecimal(300.00));
        
        VendaFactory factory = new Loja();
        
        Venda venda = new Venda(factory);
        
        venda.realizaVenda(produto);
        
    }
    
}
