//this program aims to create a prgram where a user can calculate his monthly emi payment 
import java.util.Scanner;

 class  calculate_monthly {
   private  String name;
   private  double loan_amount;
   private  double annualInterestRate;
   private  int no_of_years;
     
   //setter methods 

   public  void set_loan_amount( double  loan_amount){
        this.loan_amount = loan_amount;
       }
    public void set_name(String name){
        this.name = name;
    }
    public void set_year(int years){
        this.no_of_years = years;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //calculate monthly payment

    public double calculation(){
        int months = no_of_years*12;
        double monthlyInterestRate = annualInterestRate/12/100;

        // correct formula for monthly payment calculation

        double monthly_payment =  (loan_amount*monthlyInterestRate)/(1-Math.pow(1+monthlyInterestRate, -months));
        System.out.println("monthly payment :" + monthly_payment);
       
        return  monthly_payment;
    }
}

public   class monthlypayment{
 public static void main(String args[]){
       Scanner x = new Scanner (System.in);
   
    
    calculate_monthly person_1 = new calculate_monthly();
     
    //input name 
    
    System.out.println("enter the name ");
    String name = x.nextLine();
    person_1.set_name(name);
     
    //enter the loan amount 
    System.out.println("enter the amount ");
    double loan_amount = x.nextDouble();
     person_1.set_loan_amount(loan_amount);
     
    //enter the number of years 
     System.out.println("enter the time period ");
     int no_of_years = x.nextInt();
     person_1.set_year(no_of_years);

     //input annual interest rate 
     System.out.println("enter the annual interest rate (in percetage)");
     double annualInterestRate = x.nextDouble();
     person_1.setAnnualInterestRate(annualInterestRate);
     
     //calculate the monthly payment 

     double monthly_payment = person_1.calculation();
     
     //display the monthly payment 
     System.out.printf(" the monthly payment for %s is : %.2f\n",name,monthly_payment);


 }
}