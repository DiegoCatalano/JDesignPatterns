
package dp.structural.adapter;

/**
 *
 * @author Filipe
 */
public class RetanguloAdapter implements IForma{
    
    private Retangulo adaptador;
    
    public RetanguloAdapter(Retangulo retangulo){
        this.adaptador = retangulo;
    }

    @Override
    public void desenhar(int x, int y, int a, int b) {
        int i = Math.min(a, x);
        int k = Math.min(y, b);
        int largura = Math.abs(a-x);
        int altura = Math.abs(y-b);
        adaptador.desenhar(i, k, altura, largura);
    }
    
}
