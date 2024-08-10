//printing patterns 
//first basic sqaure star pattern 

public class ptrn1{
    public static void main(String[] args){
        //initializing the 2d array 

        char[][] star = new char[5][5];
        //storing the star paatern
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                star[i][j] = '*';
            }
        }
        //printing the square star pattern 
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(star[i][j]+ " ");
            }
            System.out.print("\n");
        } 
        //trying to print the same pattern using a for loop

        for (int i=0;i<5;i++){
            for(int j= 0 ;j <5;j++){
                System.out.print("        *");
            }
            System.out.print("\n");
        }
        
    }
}
