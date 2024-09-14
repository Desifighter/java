package parivar;
import java.util.Scanner;

public class cumulative_lenght {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuilder names[]=new StringBuilder[4];
        int count=0;
        for (int i = 0; i < 4; i++) {
            names[i]=new StringBuilder(scan.next());
            count=count+names[i].length();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Count = "+count);
        
    }
}
