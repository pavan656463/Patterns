package SOLID.Liskov.non_liskov;

// Client Code
public class LiskovViolationExample {
    public static void makeBirdFly(Bird bird) {
        bird.fly(); // Polymorphism in action
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();   // Creating a Sparrow instance
        Bird penguin = new Penguin();   // Creating a Penguin instance

        makeBirdFly(sparrow);   // Works fine, Sparrow can fly
        makeBirdFly(penguin);   // Throws UnsupportedOperationException, as Penguins can't fly
    }
}

