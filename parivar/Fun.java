package parivar;
import java.util.*;
class Fun{

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Random rd=new Random();
      String[] fun={"Rock","Paper","Scissors"};
      int b;
      System.out.println("Welcome To Rock  Paper Scissor game\n");
      do {
        int a=rd.nextInt(3);
        System.out.println("Enter for \nRock --> 0\nPaper --> 1\nScissors --> 2\n");
        b=sc.nextInt();
        
        System.out.println("\nComputer selected  "+fun[a]+"  And  You selected "+fun[b]+"\n");

         if (a==b) {
             System.out.println("Game draw");
         } else {
             if (a==0&&b==1) {
                 System.out.println("You win");
             } else if(a==0&&b==2) {
                System.out.println("Computer win");
             }
             else if (a==1&&b==0) {
                System.out.println("Computer win");
             }
             else if (a==1&&b==2) {
                System.out.println("You win");
             }
             else if (a==2&&b==0) {
                System.out.println("You win");
             }
             else if (a==2&&b==1) {
                System.out.println("Computer win");
             }
            
        
         }
         System.out.println("\nEnter 99 to exit game or enter 0"); 
             b=sc.nextInt();
      } while (b!=99); 
      System.out.println("Game over");

         
        
      }
           
   }
   
