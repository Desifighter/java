package parivar;
import java.util.Scanner;

public class driven_program {
    public static void main(String[] args) {
        int n,marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for input");
        n=sc.nextInt();
        if (n==1) {
            System.out.println("Enter marks");
            marks=sc.nextInt();
            if (marks>=90) {
                System.out.println("This is Good");
            } else if(89>=marks&&marks>=60) {
                System.out.println("This is also Good");
            }
            else{
                System.out.println("This is Good as well");
            }
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
