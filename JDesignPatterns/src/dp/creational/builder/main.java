/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.Builder;


/** -Builder é um padrão Criacional
*	- Utilização: construção de objetos complexos
*	- É adequado quando se trata da construção de representações múltiplas de uma mesma classe.
*	
*	- Composto por: ClasseBuilder (interface ou abstract class), ConcreteBuilder(construção) , 
*	Director (gera o objeto final), Product (classe do objeto que será criado).
*
*	- Desvantagem: Requer criar um concrete builder específico para cada instância diferente do produto.
*/  


/**
 *
 * @author joao
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ICarroBuilder builder = new VeiculoConstrutor();        
        CarroVermelho carBuildDirector = new CarroVermelho(builder);  //Construtor director         
        System.out.println(carBuildDirector.construtor());
        
        //Exemplo de outro veiculo
        //ICarroBuilder builder2 = new VeiculoConstrutor(); não necessário
        

        Caminhao caminhaoDirector = new Caminhao(builder);
        Caminhao caminhaoDirector1 = new Caminhao(builder);
        
        
        System.out.println(caminhaoDirector.construtor());
        System.out.println(caminhaoDirector1.construtor());
    }

}
    

