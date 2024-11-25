package Behaviour_design_pattern.visitor;

public interface Visitor {
    void visit(Manager manager);
    void visit(Engineer engineer);
    
    // Additional functions
    void visitForBenefits(Manager manager);
    void visitForBenefits(Engineer engineer);
    
    void visitForTaxes(Manager manager);
    void visitForTaxes(Engineer engineer);
    
    void visitForTotalCompensation(Manager manager);
    void visitForTotalCompensation(Engineer engineer);
}


