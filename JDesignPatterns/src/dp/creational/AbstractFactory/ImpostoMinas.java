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
public class ImpostoMinas implements Imposto {

    public ImpostoMinas() {}

    /**
     *
     * @param produto
     * @return
     */
    @Override
    public double calcularImposto(Produto produto) {
       
        BigDecimal imposto = new BigDecimal("0.18");
       imposto = imposto.multiply(produto.getValorUnitario());
       
       
        return imposto.doubleValue();
       
    }
    
}
