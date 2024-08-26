//in java u can pass by reference by passing the class type variable which are reference to an object

class Test{
    double a,b;
    Test(double  i, double  j ){
        a = i;
        b = j;
    }
    //pass an object 

    void meth(Test o ){
        o.a *= 2;
        o.b/= 2;
    }
}

public class PassObjRef{
    public static void main(String [] args ){
      Test ob1 = new Test(10, 15);
      System.out.println("ob1.a and ob1.b b4 call: "+ ob1.a + " "+ ob1.b);
      ob1.meth(ob1);
      System.out.println("ob1.a and ob1.b after call: "+ ob1.a + " "+ ob1.b);
    
    }

}