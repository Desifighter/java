package parivar;
import java.util.*;

public class all_even_number_untill_n {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                System.out.println(i);
            } 
        }  
    }
}
