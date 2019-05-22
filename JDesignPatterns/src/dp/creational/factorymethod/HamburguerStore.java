
package dp.creational.FactoryMethod;

public abstract class HamburguerStore{
    
    Sanduiche createHamburguer(String type){        
        return null;
    }
    
    public Sanduiche orderHamburguer(String type){
        
        Sanduiche hamburguer;
        
        hamburguer = createHamburguer(type);
        
        hamburguer.prepare();
        hamburguer.assar();
        hamburguer.fritar();
        hamburguer.embalar();
        
        
        return hamburguer;
        
    }
    
    
    
}

