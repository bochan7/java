//making box object using constructors
//it is the constructors job to initialize the internal state of an object so that the code creating an instance will have a fully initialized , usable object immediately 

//beigning with simple constructor that sets the dimension of each box to the same values 
/* here box uses a constructor to initialize the dimension 
 * of the box 
 */

 class box1 {
   double width ;
   double height;
   double depth;
   
   //this is constructor for box 
  
 box1(){
    System.out.println("constructing box ");
    width = 10;
    height = 10;
    depth = 10;
 }
//compute and return volume 
double volume (){
    return width*depth*height;
 }

}

//using parameterized constructor so diffn objects created can have diffn values assigned 

class box2{
    double length ;
    double width;
    double height;
    //this is  parameterised constructor for box 
    box2(double l , double w , double h){
    System.out.println("consturcting parameterised box"); 
     length = l;
     width = w;
     height = h;
    }
   //calculating volume 

   double volume(){
    return length*width*height;
   }

}


public class box{
    public static void main(String[] args){
        //declare ,allocate and initialize box objects 

        box1 mybox1 = new box1();

        box1 mybox2 = new box1();

        //declaring another boxes with paramenterised constructor 

        box2 mybox3 = new box2(10, 20, 30);
        box2 mybox4 = new box2(30, 60, 120);
  
        //getting volume of new boxes i.e boxes with parameterized constructor 
        System.out.println("volume of box 3 :"  + mybox3.volume());
        System.out.println("volume of box 4:"+ mybox4.volume());
        
        double vol;

        //get volume of first box 

        vol = mybox1.volume();
        System.out.println("volume of first box is " + vol);
    
        vol = mybox2.volume();
        System.out.println("volume of second box is "+ vol);   
     } 
} 
