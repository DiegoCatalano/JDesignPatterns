
package dp.structural.adapter;

/**
 *
 * @author Filipe
 */
public class Linha {
    
    public void desenhar(int x1, int y1, int x2, int y2){
        float f = (float) Math.sqrt(Math.pow(Math.abs(x1-x2), 2)+Math.pow(Math.abs(y1-y2), 2));
        
        System.out.format("Linha do ponto A:(" + x1 + "," + y1 + "), ao ponto B(" + x2 +","+y2+") de módulo: %.3f%n",f);
        
        //System.out.format("Linha do ponto A:(%d,%d), ao ponto B(%d,%d) e módulo: %.3f%n",x1,y1,x2,y2,f);
    }
}
