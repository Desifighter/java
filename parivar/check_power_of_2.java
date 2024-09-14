package parivar;
import java.util.Scanner;

public class check_power_of_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=2,b=scan.nextInt(),d=0,c=1,sample=b;
        while (d==0) {
            c=b/a;
            d=b%a;
            b=c;
        }
        if (c==0) {
            System.out.println(sample+" is power of 2");
        }
        else{System.out.println(sample+" is not  power of 2");}

    }
}
