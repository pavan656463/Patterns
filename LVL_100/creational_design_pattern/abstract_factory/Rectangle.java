package creational_design_pattern.abstract_factory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }
 }