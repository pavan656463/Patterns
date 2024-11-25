package Behaviour_design_pattern.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
       Subject subject = new Subject(10);
 
       new HexaObserver(subject);
       new OctalObserver(subject);
       new BinaryObserver(subject);
 
       subject.setState(15);
       subject.setState(10);
    }
 }