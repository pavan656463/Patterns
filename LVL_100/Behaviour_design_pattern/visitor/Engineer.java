package Behaviour_design_pattern.visitor;

public class Engineer implements Employee {
    private double salary;

    public Engineer(double salary) {
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
