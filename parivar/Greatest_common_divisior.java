package parivar;
import java.util.Scanner;

public class Greatest_common_divisior {
    public static int GCD(int a,int b) {
        int temp;
        // a always smaller than b  a=16 b=3
        if (a>b) {
            temp=b;//temp=3
            b=a;  //b=16
            a=temp;//a=3
        }
        int remainder=1;
        while (remainder>0) {
            remainder=b%a;
            if (remainder>0) {
                b=a;
                a=remainder;
            }
            else{
                break;
            }
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter a = ");
        a=sc.nextInt();
        System.out.println("Enter b = ");
        b=sc.nextInt();
        System.out.println("GCD or HCF ="+GCD(a, b));

    }

}
