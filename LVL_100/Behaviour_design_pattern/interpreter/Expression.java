package Behaviour_design_pattern.interpreter;

public interface Expression {
    //public boolean interpret(String context);
    public boolean evaluate(String context);
    //public boolean match(String context) ; 

    // based on keyword usage interpertor , match can be used 
 }