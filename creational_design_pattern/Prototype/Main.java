package creational_design_pattern.Prototype;

// Define the P class
class P {
    public void run() {
        System.out.println("Pavan123");
    }
}

// Define the Person class that extends P
class Person extends P {
    private String name;
    private int age;
    private boolean isMarried;

    public Person(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    // @Override
    // public void run() {
    //     System.out.println("kumar");
    // }
}

public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Pavan", 21, false);

        // Upcasting to P
        //P p = person;
        person.run();  // This will also print "kumar" because of method overriding
    }
}
