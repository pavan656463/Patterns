package SOLID.Liskov.examples;

public class ShapeAreaCalculator {
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        printArea(rectangle); // Outputs: Area: 20.0

        Shape square = new Square(4);
        printArea(square); // Outputs: Area: 16.0
    }
}
    