package Behaviour_design_pattern.observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update(int oldState, int newState) {
       System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
    }
 }
