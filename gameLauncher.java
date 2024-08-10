/** summary:- the guessing game involves a game object and three player objects. the 
 * game generates a random number between 0 and 9 , and three plater objects try to guess it  
 */
/*the logic :
 * the gameLauncher class is where the application starts;it has the main() method
 * 2.In the main method , a guessgame object is created , and it startGame()method is called 
 * 3.the GuessGame object's startGame() method is where the entire game plays out it creates three players and
 * then 'thinks of a random number (the target for the player to guess)' it then asks each player to guess,check result,and either prints out information 
 * about the winning player or asks them to guess again.
 */

 class GuessGame{

     public void startGame(){
      player p1 = new player();
      player p2 = new player();
      player p3 = new player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) { 
         System.out.println("number to guess is " + targetNumber);
         p1.guess();
         p2.guess();
         p3.guess();
         
         guessp1 = p1.number();
         System.out.println("player one guessed " + guessp1);
         guessp2 = p2.number();
         System.out.println("player two guessed " + guessp2);
         guessp3 = p3.number();
         System.out.println("player three guessed " + guessp3);
         if (guessp1 == targetNumber){
            p1isRight = true;
         }
         if (guessp2 == targetNumber){
            p2isRight = true;
         }
         if (guessp3 == targetNumber){
            p3isRight = true;
         }
         if(p1isRight || p2isRight || p3isRight){
            System.out.println("we have a winner "); 
            System.out.println("Player one got it right? " + p1isRight);
            System.out.println("Player two got it right? " + p2isRight);
            System.out.println("Player three got it right? " + p3isRight);
            System.out.println("Game is over.");
            break;
         }
         else{
            System.out.println("Players will have to try again.");
         }
        }

    }
}


public class gameLauncher{
   public static void main(String [] args){
      GuessGame g1 = new GuessGame();
      g1.startGame();
   }
}

class player{
   void guess(){

   }
   int number(){
    return 5;
   }
}