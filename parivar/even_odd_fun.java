package parivar;
import java.util.Scanner;

public class even_odd_fun {
    public static void OddEven(int n) {
        if (n%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number ");
        n=sc.nextInt();
        OddEven(n);

    }
}
