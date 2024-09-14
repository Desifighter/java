package parivar;
import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number to check odd even");
        num= sc.nextInt();
        if (num%2==0) {
            System.out.println("Number is even ");
        } else {
            System.out.println("Number is odd ");
        }
    }
}
