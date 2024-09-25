package creational_design_pattern.Builder;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
       return 50.5f;
    }
 
    @Override
    public String name() {
       return "Chicken Burger";
    }
 }
