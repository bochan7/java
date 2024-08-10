/*initializing a multidimensional array using curly braces
 n all which strores product of row and column */

public class matrix{
    //initializing multidimensional array 
    public static void main(String[] args) {
    double [][] m = {
        { 0*0,0*1,0*2},
        {1*0,1*1,1*2},
        {2*0,2*1,2*2}
    };
    //printing the matrix 
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print( m[i][j]+" " );
        }
        System.out.print(("\n"));
    }
    }

}
