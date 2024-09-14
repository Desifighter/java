package parivar;
import java.util.*;
public class a_b_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a =");
        a=sc.nextInt();
        System.out.println("Enter b =");
        b=sc.nextInt();
        if (a==b) {
            System.out.println("A equal to B");
        } else if(a>b) {
            System.out.println("A greater than B");
        }
        else{
            System.out.println("A lesser than B");
        }
    }
}
