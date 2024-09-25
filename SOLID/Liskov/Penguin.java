package SOLID.Liskov;

class Penguin extends NonFlyingBird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}