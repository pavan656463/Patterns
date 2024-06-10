package creational_design_pattern.Builder;

public class Coke extends ColdDrink {

    @Override
    public float price() {
       return 30.0f;
    }
 
    @Override
    public String name() {
       return "Coke";
    }
 }
