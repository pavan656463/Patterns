package Behaviour_design_pattern.chain_of_responsibility;

public class ChainPatternDemo {
	
    private static AbstractLogger getChainOfLoggers(){
 
       AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR); // 3
       AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG); // 2
       AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO); // 1
 
       errorLogger.setNextLogger(fileLogger);
       fileLogger.setNextLogger(consoleLogger);
 
       return errorLogger;	
    }
 
    public static void main(String[] args) {
       AbstractLogger loggerChain = getChainOfLoggers();
 
       //loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
 
       //loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
 
       loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
   }
   