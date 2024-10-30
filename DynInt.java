// showcasing dynamic initialization of a variable 

public class DynInt{

    public static void main(String[] xyz){
        double a = 30.0,b=45.0;
        // c variable which will store the value will be initialized dyanamically 
        double c = Math.sqrt(a*a+b*b);
        System.out.println("Hyputenuse of the triangle is " + c);
    }
}