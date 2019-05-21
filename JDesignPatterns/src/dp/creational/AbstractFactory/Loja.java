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
public class Loja implements VendaFactory {

    @Override
    public Imposto criaNFE() {
       
        Imposto notaFiscal = new ImpostoMinas();
        return notaFiscal;
    }

    @Override
    public NotaFiscal criaNota() {
        NotaFiscal boleto = new ITUPagamentosLtda();
        
                return boleto;
        
    }
    
    
}
