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

import java.util.List;
import java.util.ArrayList;

//composite
public class Bloco implements ElementoDoQuestionario{
//esta classe é composta de outros componentes, podem ser folhas ou outras composições. O acesso e o gerenciamentos dos filhos
//pertence somente ao composite
//neste caso, esta classe pode ser composta por Questões ou por outros Blocos.
    
    //cria lista de elementos(blocos ou questões)
    private List<ElementoDoQuestionario> ElementosFilhos = new ArrayList<>();
    
    //método comum
    @Override
    public void exibir(){ //exibe apenas os filhos, filhos dos filhos, etc. Sempre vão ser QUESTÕES a serem exibidas.
       for(ElementoDoQuestionario elemento : ElementosFilhos){
           elemento.exibir();
       }
    }
    
    //adiciona elementos no bloco (questões ou blocos)
    public void adicionar(ElementoDoQuestionario elemento){
        ElementosFilhos.add(elemento);
    }
    
    //remove elementos do bloco (questões ou blocos)
    public void remover(ElementoDoQuestionario elemento){
        ElementosFilhos.remove(elemento);
    }    
}
