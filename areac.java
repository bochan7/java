
class circle{
    int radius;

     circle(int radius ){
        this.radius = radius;
    }

    void cal_area () {
        int z;
        z = (int) 3.14*this.radius*this.radius;
        System.out.println(z);
    }
}




public class areac {
    public static void main(String[] args) {
        circle c1 = new circle(5);

        c1.cal_area();
    }
}

