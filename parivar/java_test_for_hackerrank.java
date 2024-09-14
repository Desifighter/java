package parivar;
import java.io.*;
import java.util.*;

public class java_test_for_hackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String str = String.format("%03d", x);
                for (int index = s1.length(); index < 15; index++) {
                    s1=s1+' '; 
                }
                System.out.println(s1+str);
                
                
            }
            System.out.println("================================");
            
        
    }
}
