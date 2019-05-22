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
public class ITUPagamentosLtda implements NotaFiscal {

    public ITUPagamentosLtda() {
    }
 
    

    @Override
    public void emitirNotaFiscal(Produto produto, double imposto) {
      System.out.println(" ITU Pagamentos ");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
         System.out.println("Descrição:" + produto.getNome());
          System.out.println("Quantidade : " + produto.getQuantidade());
           System.out.println("valor: R$ " + produto.getValor());
            System.out.println(" Imposto: " + imposto);
             System.out.println(); 
    
}

}