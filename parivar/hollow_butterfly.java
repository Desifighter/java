package parivar;
public class hollow_butterfly {
    public static void main(String[] args) {
        int n=8;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i ; j++)
            {
                if (j==1||j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            for (int j = 1; j <=2*n-2*i; j++)
             {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                if (j==1||j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
           
            }
        System.out.println();
       }
        for (int i = n; i>0 ; i--) 
        {
            for (int j = 1; j <= i ; j++) {
                if (j==1||j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            for (int j = 1; j <=2*n-2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                if (j==1||j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    }
