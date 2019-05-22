
package dp.creational.FactoryMethod;

public class McDonalds extends HamburguerStore {
    
    @Override
    Sanduiche createHamburguer(String item){
        switch (item) {
            case "BigMac":
                return new BigMac();
            case "Quarteirao":
                return new Quarteirao();
            case "Big Tasty":
                return new BigTasty();
            case "Cheddar McMelt":
                return new CheddarMcMelt();
            default:
                return null;   
        }
    } 
}
