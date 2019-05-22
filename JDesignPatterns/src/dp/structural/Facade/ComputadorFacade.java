/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.structural.Facade;

/**
 *
 * @author iurij
 */
//Exemplo de um Facade que abstrai uma lógica complexa.

public class ComputadorFacade {
    private UnidadeCentralDeProcessamento unidadeCentralDeProcessamento;
    private Memoria memoria;
    private DiscoRigido discoRigido;
  
    public ComputadorFacade() {
        this.unidadeCentralDeProcessamento = new UnidadeCentralDeProcessamento();
        this.memoria = new Memoria();
        this.discoRigido = new DiscoRigido();
    }
  
    public void run() {
        unidadeCentralDeProcessamento.processaDado();
        memoria.carregaDado();
        discoRigido.leDado();
    }
}
