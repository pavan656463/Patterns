package SOLID.Liskov.non_liskov;

// Superclass - Bird
abstract class Bird {
    public abstract void fly();
}

// Subclass - Sparrow (inherits from Bird)
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

// Subclass - Penguin (inherits from Bird)
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}