//making a java program where user enters numbers from 0 to 50 and on the basis of it output is generated 
//about what number appear how many times 

import java.util.Scanner;

public class ra1 {
    public static void main (String [] args ){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers u wanna enter ");
        x = sc.nextInt();
        int [] arr1 = new int[x];
        //taking input 
        int y ;
        for(int i =0;i<x;i++){
            System.out.println("enter the number ");
            y=sc.nextInt();
            if(y == 0 ){
                break;
            }
            else{
            arr1[i] = y;
            }
        }

        //showcasing array 
        for(int i=0;i<x;i++){
            System.out.print(arr1[i]+" ");
        }
        //making a array which will contain only unique element 
        //making a third array which will store the occurance of each number 
        int [] arr3 = new int[x];
        int [] arr2 = new int[x];
        int g =0;
  //counitng the occurence of each element and storing it in third array 
  int k=0;
  for(int i=1;i<x;i++){
  

  }
  
  
  
  
  
  
        //unique array 
        for(int m =0 ; m < x ; m++){
            int flag = 1;
           
         for(int j=0;j<x;j++){
            if(arr1[m] == arr2[j]){
                flag++;
                break;
            }
         }
         
         if(flag == 1 ){
            arr2[g] = arr1[m];
            g++;
         }
         
    }
  
        System.out.println("\nthe unique array :");
      //showcasing the unique array 
      for(int i=0;i<x;i++){
        if(arr2[i] == 0 ){
            break;
        }
        else{
        System.out.print(arr2[i]+" ");
    }
}
  // showcasing the array which consists of number of time elements were repeated 
  System.out.println("----");
  for(int l=0;l<x;l++){
    System.out.print(arr3[l]+" ");
}

    }
}
