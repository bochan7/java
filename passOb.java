//paasing objects to methods 

//object may be passed to methods 

class test{
    int a,b;

    test(int i,int j){
        a = i;
        b = j;
    }

    //return true if o is equal to the invoking object 

    boolean equalTo(test o){
        if(o.a == a && o.b == b ){
            return true;
        }
        else{
            return false;
        }
    }
}
public class passOb{
    public static void main(String [] args){
        test ob1 = new test(100,22);
        test ob2 = new test(100,22);
        test ob3 = new test(-1 , -1 );

        System.out.println("ob1 == ob2: "+ ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
