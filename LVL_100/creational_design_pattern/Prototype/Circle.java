package creational_design_pattern.Prototype;
public class Circle extends Shape {

    public Circle(){
      type = "Circle";
    }
 
    @Override
    public void draw() {
       System.out.println("Inside Circle::draw() method.");
    }
 }
