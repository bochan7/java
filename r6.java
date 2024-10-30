//super keyword has two works 
//first one is to acess the constructor of super class 
//second is to overcome the name hiding as it can acess members and methods of superclass distinctly in sub class
class A{
    int i;
}
//creating a subclass by extending a

class  B extends A{
int i; //this i is of b which is used here to hide the i of a 

B(int a,int b ){
    super.i = a; //i in a
    i=b; // i in b 
}
void show(){
    System.out.println("i in super class : " + super.i);
    System.out.println("i in subclass " + i);
}
}


public class r6 {
    public static void main(String [] args ){
        B subOb = new B(1,2);
        subOb.show();
    }
}
