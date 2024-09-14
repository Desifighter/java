package parivar;
import java.util.Random;
import java.util.Scanner;

/**
 * Game */
 class Game{
   private Random obs=new Random();
   private Scanner sc=new Scanner(System.in);
    private int randomNumber=obs.nextInt(100)+1;
    private int userInput;
    public void gameStart(){
         
         int count=0;
         do {
            System.out.println("Enter your number ");
            userInput=sc.nextInt();
            if (userInput>randomNumber) {
                System.out.println("\nEnter lesser than "+userInput);
               // count++;
            }  else if(userInput<randomNumber) {
                System.out.println("\nEnter greater than "+userInput);
                //count++;
            }
             count++;
         } while (userInput!=randomNumber);
         System.out.println("\nYou guessed number in "+count+" time ");
    }
}
public class numberGuess {
    public static void main(String[] args) {
        Game player=new Game();
       player.gameStart();

    }
}
