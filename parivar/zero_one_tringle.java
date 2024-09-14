package parivar;
/* 1
   01
   101
   0101
   10101
 */  
public class zero_one_tringle {
    public static void main(String[] args) {
        int n = 20, zero = 0, one = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(one+" ");
                    if (j % 2 != 0) {
                        one--;
                    } else {
                        one++;
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(zero+" ");
                    if (j % 2 != 0) {
                        zero++;
                    } else {
                        zero--;
                    }
                }
            }
            zero = 0; one = 1;
            System.out.println();
        }
    }
}
