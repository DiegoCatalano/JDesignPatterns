/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.structural.Composite;

/**
 *
 * @author rai_a
 */

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //criando questões
        Questao questaoA = new Questao();
        Questao questaoB = new Questao();
        Questao questaoC = new Questao();
        Questao questaoD = new Questao();
        
        //criando blocos
        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        
        //adicionado questões ou blocos aos blocos
        bloco1.adicionar(questaoA);
        bloco1.adicionar(questaoB);
        bloco1.adicionar(questaoC);
        
        bloco2.adicionar(questaoD);
        
        bloco3.adicionar(bloco1);
        bloco3.adicionar(bloco2);
        
        //NESTE CASO devem ser exibidas quatro questões
        bloco3.exibir();
           
    }
    
}
