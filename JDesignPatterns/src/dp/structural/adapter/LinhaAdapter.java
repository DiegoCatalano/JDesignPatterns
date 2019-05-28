
package dp.structural.adapter;

/**
 *
 * @author Filipe
 */
public class LinhaAdapter implements IForma{

    /** 
     *  Criação de objeto caracteristica do adapter e aplicada
     *  efetivamente do método sobrescrito.
     */
    private Linha adaptador;
    
    public LinhaAdapter(Linha linha){
        this.adaptador = linha;
    }
    
    @Override
    public void desenhar(int x, int y, int a, int b) {
        adaptador.desenhar(x, y, a, b);
    }
    // Mudança mais significativa em RetanguloAdapter
}
