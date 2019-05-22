package dp.structural.Flyweight;


import java.util.HashMap;

public class UnidadeFactory { 
	//Foi implementado a classe UnidadeFactory na qual foi implementado o método getBarbaro. 
			
	private static final HashMap<String, Barbaro> barbaroMap = new HashMap<String, Barbaro>(); 
	//A classe UnidadeFactory tem um HashMap de Barbaro com uma chave como saúde do objeto Barbaro.

	   public static Unidade getBarbaro(String saude) {
	      Barbaro barbaro = (Barbaro)barbaroMap.get(saude);

	      if(barbaro == null) {
	    	  barbaro = new Barbaro(saude);
	    	  barbaroMap.put(saude, barbaro); 
	    	  //o método put() é usado para inserir um novo par de elementos
	         System.out.println("Saúde da unidade: " + saude);
	      }
	      return barbaro;
	   }
}
