

class Rectangle{
   private int length;
    private int breadth;

    void set_length(int x){
        if(x>5){
       this.length = x;
        }
        else{
            System.out.println("error");
        }
    }
    void set_breadth(int y ){
        if(y>5){
            this.breadth = y;
        }
        else{
            System.out.println("error");
        }
    }

    int cal_area(){
        int z;
     
        z =this.length*this.breadth;

        return z;
    }
}


public class area{
    public static void main(String [] args ){

        Rectangle r1 = new Rectangle();
        r1.set_breadth(10);

        r1.set_length(15);
        int area1;

        area1 = r1.cal_area();

        System.out.println(area1);

    }
}
