package creational_design_pattern.abstract_factory;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
       System.out.println("Inside RoundedRectangle::draw() method.");
    }
 }
