
//working with enums
//wnums in java area a powerful feature that allows us to define a set of named constants  
import java.util.Scanner;

public class ra2 {
    public static void main(String [] args ){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter x");
    int x = sc.nextInt();
    ra1 rough = new ra1();
    rough.set_x().set_y();
    }

}

class ra1{
    private int x;
    private int y;

    public void set_x(){
    this.x = x;
    }
    public void set_y(){
        this.y = y;
    }
}