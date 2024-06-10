package Behaviour_design_pattern.visitor;

public class Manager implements Employee {
    private double salary;

    public Manager(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

