
package dp.creational.FactoryMethod;

public class BurguerKing extends HamburguerStore{
    @Override
    Sanduiche createHamburguer(String item){
        switch (item) {
            case "Whopper":
                return new Whopper();
            default:
                return null;   
        }
    } 
}
