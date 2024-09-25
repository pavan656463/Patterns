package Behaviour_design_pattern.observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update(int oldState, int newState) {
       System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
    }
 }
