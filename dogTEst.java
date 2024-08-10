//first example of making objects in java and starting of oop from here
class Dog{
    int size;
    String breed;
    String name;

    void get_info(){
        System.out.println("this dog's name is " + name + " and its of " + breed + " breed "+" having size " + size);
    }
    void bark(){
        System.out.println("WOoff !! woff !!");
    }

}

public class dogTEst{
 public static void main(String[] args) {
  Dog d1 = new Dog();
  d1.breed = "german shephard";
  d1.name = "Charlie";
  d1.size = 40;
  
  Dog d2 = new Dog();
  d2.breed = "tibetian mastiff";
  d2.name = "sheru";
  d2.size = 30;

  d1.get_info();
  d1.bark();

  d2.get_info();
  d2.bark();
 }
}

