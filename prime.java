//to check if the entered number is prime or not 

import java.util.Scanner;
public class prime {
    public static void main(String args[]){
      System.out.println("enter the number to check if it is a prime number or not ");
      Scanner x = new Scanner(System.in);
      
      int num = x.nextInt();

      boolean isPrime ;
      if(num <2 ){
        isPrime = false;
      }
      else isPrime =true;
      for(int i=2;i <= num/i; i++){
        if((num % i) == 0){
           isPrime = false;
           break;
        }
      }
    if(isPrime){
        System.out.println("Prime");
           }
    else{
        System.out.print("not prime ");
    }
        }
}
