package parivar;
import java.util.Scanner;

public class prime_or_not_function {
    public static void primecheck(int n) {
        int count=1;
        for (int i = 2; i < n ; i++) {
            if (n%i==0) {
                count++;
            }
        }
        if (count==1) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check prime or not");
        n=sc.nextInt();
        primecheck(n);
    }
}
