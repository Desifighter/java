package parivar;
public class practice {
   
    static void pattern(int n){
        if (n==1) {
            System.out.print("X");
        } else {
            for (int i = 0; i < n; i++) {
              System.out.print("X ");  
            }
            System.out.println();
            pattern(n-1);
        
        }
    }
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
       pattern1_rec(n);
    }
}
