package parivar;
import java.util.Scanner;

/**
 * patterns
 */
public class patterns {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String word=sc.nextLine();
    int var;
    Scanner scan=new Scanner(System.in);
    var= scan.nextInt();
    switch (var) {
        
        case 1 :
              System.out.println("Number is one ");
              break;
        case 2 -> System.out.println("Number is two");
        case 3 -> System.out.println("Number is three");
        default -> System.out.println("Number is upper than three");

    }
   

    

  } 
}