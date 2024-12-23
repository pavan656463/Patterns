package Behaviour_design_pattern.interpreter;

public class AndExpression implements Expression {
	 
    private Expression expr1 = null;
    private Expression expr2 = null;
 
    public AndExpression(Expression expr1, Expression expr2) { 
       this.expr1 = expr1;
       this.expr2 = expr2;
    }
 
    @Override
    public boolean evaluate(String context) {		
       return expr1.evaluate(context) && expr2.evaluate(context);
    }
 }
