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

//leaf
public class Questao implements ElementoDoQuestionario{
//representa uma folha, ou seja, um objeto individual (primitivo) que não possui filhos dentro da hierarquia
//neste caso, Questao é uma objeto individual pois não faz parte de um bloco (objeto composto)
    
    //método comum
    @Override
    public void exibir() {
        System.out.println("Questão");
    }   
}
