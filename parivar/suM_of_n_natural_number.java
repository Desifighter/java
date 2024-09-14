package parivar;
import java.util.*;
public class suM_of_n_natural_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter value of n");
        n=sc.nextInt();

        for (int index = 1; index <=n; index++) {
            sum=sum+index;
        }
        System.out.println("Sum of "+n+" natural number = "+sum);
    }
}
