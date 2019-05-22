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
public class Programador implements Colaborador {
 
    private Tarefa tarefa;
 
    public Programador(final Tarefa tarefa) {
        this.tarefa = tarefa;
    }
 
    @Override
    public void produz() {
        System.out.println("Programador trabalhando ");
        tarefa.realiza();
    }
 
    @Override
    public void recebeTarefa(final Tarefa tarefa) {
        this.tarefa = tarefa;
    }
 
}