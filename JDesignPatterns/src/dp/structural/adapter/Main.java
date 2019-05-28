
package dp.structural.adapter;

/**
 *
 * @author Filipe
 */
public class Main {
    public static void main(String[] args) {
        
        //  Cria vetor de formas para teste de padrão Adapter
        IForma[] formas = { new RetanguloAdapter(new Retangulo()), new LinhaAdapter(new Linha())};
        
        //  Coordenadas de pontos de teste A=(5,25) e B=(30, 70)
        int x=5, y=25, a=30, b=70;
        for (IForma forma : formas){
            forma.desenhar(x, y, a, b);
        }
    }
    
}
