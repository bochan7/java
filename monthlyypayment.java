import java.util.Scanner;

class LoanCalculator {
    // Using String for name
    private String name;
    private double loanAmount;
    private double annualInterestRate;
    private int noOfYears;

    // Setter methods
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.noOfYears = years;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Calculate monthly payment
    public double calculateMonthlyPayment() {
        int months = noOfYears * 12;
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        
        // Correct formula for monthly payment calculation
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -months));

        return monthlyPayment;
    }
}

public class monthlyypayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an instance of LoanCalculator
        LoanCalculator loanCalculator = new LoanCalculator();

        // Input name
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        loanCalculator.setName(name);

        // Input loan amount
        System.out.println("Enter the loan amount:");
        double loanAmount = scanner.nextDouble();
        loanCalculator.setLoanAmount(loanAmount);

        // Input number of years
        System.out.println("Enter the number of years:");
        int noOfYears = scanner.nextInt();
        loanCalculator.setYears(noOfYears);

        // Input annual interest rate
        System.out.println("Enter the annual interest rate (in percentage):");
        double annualInterestRate = scanner.nextDouble();
        loanCalculator.setAnnualInterestRate(annualInterestRate);

        // Calculate monthly payment
        double monthlyPayment = loanCalculator.calculateMonthlyPayment();

        // Display the monthly payment
        System.out.printf("The monthly payment for %s is: %.2f\n", name, monthlyPayment);

        // Close the scanner
        scanner.close();
    }
}
