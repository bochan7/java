//making break work like goto function in java as we don't have goto in java specifically 
//this way helps us to exist a deeply nested looop 
//here we label each loop with label keyword 

public class break_go{
    public static void main(String [] args){
        //using break as a civilized form of goto 

        boolean t =true;

        first:{
            second:{
                third:{
                    System.out.println("b4 the break");
                    if(t) break first; //break out of second loop
                    System.out.println("this won't execute ");
                }
                System.out.println("this won't execute !! ");
            }
            System.out.println("this is after second block ");
        }
        System.out.println("this is after first block");
    }
}