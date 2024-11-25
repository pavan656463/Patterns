package Behaviour_design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   Subject(int state){
      this.state = state;
   }

   public int getState() {
      return state;
   }

   public void setState(int state) {
      int oldState = this.state;
      this.state = state;
      notifyAllObservers(oldState, state); // send old value and new value to the observers
   }

   public void attach(Observer observer){ // then you should have detatch
      observers.add(observer);		
   }

   public void notifyAllObservers(int oldState, int newState){
      for (Observer observer : observers) {
         System.out.println("Print oldstate, newState" + oldState +"and new State" + newState);
         observer.update(oldState, newState); // add exception handling thingy!
      }
   } 	
}
