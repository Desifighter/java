package parivar;
import java.util.Scanner;

public class my_four_friend_names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        String[] names= new String[size];
        for (int i = 0; i < names.length; i++) {
            names[i]=sc.next();
        } 
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        } 
    }
}
