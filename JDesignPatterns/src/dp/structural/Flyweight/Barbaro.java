package dp.structural.Flyweight;

public class Barbaro implements Unidade{ // Clase Unidade que implementa a interface Unidade
	
	private String saude;
	
	
	public Barbaro(String saude) {
		this.saude = saude;
	}


	@Override
	public void draw() { // método definido na interface Unidade
		System.out.println("Unidade: Draw() [saude : " + saude);		
	}		
}
