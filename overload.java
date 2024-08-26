//demonstrating method overloading 
//whene we have one or more methods with same name in a class with different parameters then it is refered as method overloading
//number of parameter taken by method should be distinguish otherwise java will not be able to differentiate 


//demonstrating method overloading 

class OverLoadDemo{
     void test(){
        System.out.println("no parameter ");
     }
    //overload test for one integer parameter 

    void test(int a){
        System.out.println("a: "+ a);
    }
  
    //overload test for two integer parameter 
     void test(int a , int b ){
        System.out.println("a and b : " + a + "," + b);
     }

    //overload test for double parameter 
    double test(double  a ){
        System.out.println(" double a " + a);
        return  a*a;
    }
}

public class overload{
    public static void main(String[] args){

        OverLoadDemo ob = new OverLoadDemo();
        double result ;

        //call all version of test ()

        ob.test();
        ob.test(10);
        ob.test(10 , 20);
        result = ob.test(123.5);
        System.out.println("result of ob.test(123.5) : " + result);

    }
}