package parivar;
import java.util.*;
/**
 * sasta_calcy
 */
public class sasta_calcy {

    public static void main(String[] args) {
        int a,b,twich;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ");
        a=sc.nextInt();
        System.out.println("Enter b ");
        b=sc.nextInt();
        System.out.println("Enter \n1 for + \n2 for -\n3 for *\n4 for /\n5 for % ");
        twich=sc.nextInt();
        switch (twich) {
            case 1:
            System.out.println("a+b=");
                System.out.println(a+b);
                break;
                case 2:
                System.out.println("a-b=");
                System.out.println(a-b);
                break;
                case 3:
                System.out.println("a*b=");
                System.out.println(a*b);
                break;
                case 4:
                System.out.println("a/b=");
                System.out.println((float)a/b);
                break;
                case 5:
                System.out.println("a%b=");
                System.out.println(a%b);
                break;
        
            default:
            System.out.println("Wrong input ");
                break;
        }
    }
}