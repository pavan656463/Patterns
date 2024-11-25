package Behaviour_design_pattern.visitor;

public class BonusVisitor implements Visitor {
    @Override
    public void visit(Manager manager) {
        double bonus = manager.getSalary() * 0.2; // 20% bonus for managers
        System.out.println("Bonus for manager: " + bonus);
    }

    @Override
    public void visit(Engineer engineer) {
        double bonus = engineer.getSalary() * 0.1; // 10% bonus for engineers
        System.out.println("Bonus for engineer: " + bonus);
    }
    
    // Additional functions
    @Override
    public void visitForBenefits(Manager manager) {
        System.out.println("Benefits for manager: Health insurance, Retirement plan");
    }

    @Override
    public void visitForBenefits(Engineer engineer) {
        System.out.println("Benefits for engineer: Health insurance");
    }
    
    @Override
    public void visitForTaxes(Manager manager) {
        double taxes = manager.getSalary() * 0.3; // 30% tax for managers
        System.out.println("Taxes for manager: " + taxes);
    }

    @Override
    public void visitForTaxes(Engineer engineer) {
        double taxes = engineer.getSalary() * 0.2; // 20% tax for engineers
        System.out.println("Taxes for engineer: " + taxes);
    }
    
    @Override
    public void visitForTotalCompensation(Manager manager) {
        double total = manager.getSalary() + (manager.getSalary() * 0.2); // Salary + 20% bonus
        System.out.println("Total compensation for manager: " + total);
    }

    @Override
    public void visitForTotalCompensation(Engineer engineer) {
        double total = engineer.getSalary() + (engineer.getSalary() * 0.1); // Salary + 10% bonus
        System.out.println("Total compensation for engineer: " + total);
    }
}
    

