//ninja technique for sorting n searching 
import java.util.*;

public class r7 {
    public static void main(String [] args ){
        int [] arr1 = { 5 ,6,3,4};
        for(int x : arr1 ){
            System.out.println(x);
        }
        Arrays.sort(arr1);
        System.out.println("sorted array ");
        for(int x : arr1 ){
            System.out.println(x);
        }
         //binary search 
         int index = Arrays.binarySearch(arr1, 5);

         if(index >=0)
         System.out.println("found at " + index);
         else 
         System.out.println("not found ");
        
    }
}
