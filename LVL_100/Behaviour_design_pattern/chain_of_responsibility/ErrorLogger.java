package Behaviour_design_pattern.chain_of_responsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
       this.level = level;
    }
 
    @Override
    protected void write(String message) {		
       System.out.println("Error Console::Logger: " + message);
    }
 }