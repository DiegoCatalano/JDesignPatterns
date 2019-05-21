/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.AbstractFactory;

/**
 *
 * @author bully
 */
public class Venda {

        private Imposto notaFiscal;
        private NotaFiscal boleto;
        
        
    public Venda(VendaFactory factory){
        
        this.notaFiscal = factory.criaNFE();
        this.boleto = factory.criaNota();
        
    }
    
    public void realizaVenda(Produto produto){
        double imposto = notaFiscal.calcularImposto(produto);
        boleto.emitirNotaFiscal(produto, imposto);
    }


    
}

