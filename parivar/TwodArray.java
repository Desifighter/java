package parivar;
import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int key=2,i,j;
        for ( i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (key==arr[i][j]) {
                    System.out.println("\n"+i+" ,"+j);
                    
                }
            }
            //System.out.println("\n"+i+" ,"+j);
        }
    }
}
