package dp.structural.Flyweight;

public class FlyweightDesignPattern {
	private static final 	String saudes[] = { "Vazia", "Baixa", "M�dia", "Alta", "M�xima" };
	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++) {
			Barbaro barbaro = (Barbaro)UnidadeFactory.getBarbaro(getRandomSaude());
			
			barbaro.draw();
		}
	}
	private static String getRandomSaude() {
		return saudes[(int)(Math.random()*saudes.length)];
	}
}