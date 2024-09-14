package parivar;
import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println(
            "Enter number to check prime or not"
        );
        n=sc.nextInt();
        for (int i = 2; i <n; i++) {
            if (n%i==0) {
                count=1;
            }
        }
        if (count==1) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
        }
    }
}
