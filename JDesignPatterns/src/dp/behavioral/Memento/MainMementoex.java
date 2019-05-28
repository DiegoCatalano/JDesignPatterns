/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.behavioral.Memento;

/**
 *
 * @author arils
 */
public class MainMementoex {
   public static void main(String[] args) {
   
      Originator originator = new Originator();
      Armazenador careTaker = new Armazenador();
      
      originator.setState("frio ");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("quente  ");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("morno ");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("quente  ");
      
      System.out.println("Estado atual: " + originator.getState());		
      
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("Primeiro estado salvo: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Segundo estado salvo: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(2));
       System.out.println("Terceiro estado salvo "+originator.getState());
   }
}