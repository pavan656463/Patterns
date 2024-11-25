package Behaviour_design_pattern.memonto;

public class Memento {
    private String state;
 
    public Memento(String state){
       this.state = state;
    }
 
    public String getState(){
       return state;
    }	
 }