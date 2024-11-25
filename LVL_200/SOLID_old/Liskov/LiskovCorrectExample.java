package SOLID.Liskov;

// Client Code
public class LiskovCorrectExample {
    public static void makeFlyingBirdFly(FlyingBird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        // Sparrow is a flying bird
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();    // Works fine

        // Penguin is a non-flying bird
        NonFlyingBird penguin = new Penguin();
        penguin.eat();     // Works fine
    }
}

