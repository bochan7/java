import java.util.Scanner;

public class r4 {
    public static void main(String [] args ){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for x");
         x = sc.nextInt();

        int [] arr1 = new int[x];

         for(int i=0;i<arr1.length;i++){

            System.out.println("enter value ");

            arr1[i] = sc.nextInt();

         }

         for(int i=0;i<arr1.length;i++){

            System.out.print(arr1[i]);

         }

         int largest;
         largest = arr1[0];

         for(int i=0;i<arr1.length;i++){
            if(largest < arr1[i]){
                largest = arr1[i];
            }
         }
        for(int m : arr1)
            System.out.println(m);
        
        


         System.out.println("largest element " + largest);
    }
}
