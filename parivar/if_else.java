package parivar;
import java.io.*;
import java.util.Scanner;
/**
 * if_else
 */
public class if_else {

    public static void main(String[] args) {
        int age;
        System.out.println("Enter age ");
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();
        if (age>=18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are not adult");
        }
    }
}