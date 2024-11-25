package Behaviour_design_pattern.template_method;
public class TemplatePatternDemo {
    public static void main(String[] args) {
 
       Game game = new Cricket();
       game.play();
       System.out.println();
       game = new Football();
       game.play();		
    }
 }