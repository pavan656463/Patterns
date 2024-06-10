package Behaviour_design_pattern.visitor;
public class demo {
    public static void main(String[] args) {
        Employee manager = new Manager(50000);
        Employee engineer = new Engineer(60000);

        Visitor bonusVisitor = new BonusVisitor();

        manager.accept(bonusVisitor);
        engineer.accept(bonusVisitor);
        
        // Additional functions
        bonusVisitor.visitForBenefits((Manager) manager);
        bonusVisitor.visitForTaxes((Manager) manager);
        bonusVisitor.visitForTotalCompensation((Manager) manager);
        
        bonusVisitor.visitForBenefits((Engineer) engineer);
        bonusVisitor.visitForTaxes((Engineer) engineer);
        bonusVisitor.visitForTotalCompensation((Engineer) engineer);
    } 

     // if any new operations we can add through visitor.java  and bonus visitor
     // agenda is visit to methods 
}


