/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.structural.Decorator;

/**
 *
 * @author Mateus Araújo
 */
public class Main {

    public static void main(String args[]) {
        
        ICarro CarroSport = new CarroSport(new CarroBasico());
        CarroSport.montar();
        System.out.println("");

        ICarro carroSportLuxo = new CarroSport(new CarroLuxo(new CarroBasico()));
        carroSportLuxo.montar();
        System.out.println("");
        
    }

}
