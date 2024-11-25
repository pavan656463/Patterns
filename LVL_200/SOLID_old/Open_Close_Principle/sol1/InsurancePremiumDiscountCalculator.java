package SOLID.Open_Close_Principle.sol1;

public class InsurancePremiumDiscountCalculator {

    public int calculatePremiumDiscountPercent(CustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 20 ; 
        }
        return 0 ; 
    }

    public static void main(String[] args) {
        InsurancePremiumDiscountCalculator calculator = new InsurancePremiumDiscountCalculator();

        CustomerProfile healthInsuranceCustomer = new HealthInsuraceCustomerProfile();
        CustomerProfile lifeInsuranceCustomer = new VehcileInsuranceProfile();

        System.out.println("Health insurance customer discount: " + calculator.calculatePremiumDiscountPercent(healthInsuranceCustomer) + "%");
        System.out.println("Life insurance customer discount: " + calculator.calculatePremiumDiscountPercent(lifeInsuranceCustomer) + "%");
    }
    
}
