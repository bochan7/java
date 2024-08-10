//demonstrating the use of 3D array 

public class threeDarray{
    public static void main(String[] args){
        //initializing  the 3 D array of order 3 x 4 x 5
        //which means there will be 3 arrays of order 4 x 5
        int [][][] three = new int [3][4][5];
        //storing the value of multiplication of their indexes 
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    three[i][j][k] = i*j*k;
                }
            }
        }
        //diplaying the three dimenion matrix 
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    System.out.print(three[i][j][k] + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
