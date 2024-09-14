package parivar;
public class palindromic_number_pyramid {
    public static void main(String[] args) {
    int n=5,digit=1,innerloop;int increase;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            innerloop=(2*i-1);
            for (int j = 1; j <= innerloop; j++) {
                System.out.print(digit);
                increase=innerloop/2+1;
                if (j<increase) {
                    digit--;
                } else {
                    digit++;
                }

            }
            digit=i+1;
            System.out.println();
        }
    }
}
