/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.structural.Bridge;

/**
 *
 * @author fdepo
 */
public class Bridge3 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
 
        //  criar um programador que executa em Java
        Tarefa tarefaDoProgramador = new ProgramacaoJava();
        final Colaborador programador = new Programador(tarefaDoProgramador);
        programador.produz();
 
        //  criar um programador que executa Ruby!
        tarefaDoProgramador = new ProgramacaoRuby();
        programador.recebeTarefa(tarefaDoProgramador);
        programador.produz();

        
        // testes automatizados
        tarefaDoProgramador = new TestesAutomatizados();
        programador.recebeTarefa(tarefaDoProgramador);
        programador.produz();
 
        // testes manuais
        Tarefa tarefaDoHomologador = new TestesManuais();
        final Colaborador homologador = new Homologador(tarefaDoHomologador);
        homologador.produz();
 
        // programar até em Ruby
        tarefaDoHomologador = new ProgramacaoRuby();
        homologador.recebeTarefa(tarefaDoHomologador);
        homologador.produz();
 
    }
 
}