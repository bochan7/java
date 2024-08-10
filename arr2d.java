
//demonstrating use of 2 dimensional array 
public class arr2d{
    public static void main(String[] args){
     //declaring an 2d array with name twoD
     int[] [] twoD = new int[4][5];
     int i,j,k=0;
     //alloting values to the diifn cell
     for(i=0;i<4;i++){
        for(j=0;j<5;j++){
            twoD[i][j] = k;
            k++;
        }
     }
     //showcasing the array 
     for(i=0;i<4;i++){
        for(j=0;j<5;j++){
            System.out.print(twoD[i][j]+" ");
        }
        System.out.print("\n");
     }
    }
}
