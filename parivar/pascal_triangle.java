package parivar;
public class pascal_triangle {
    public static int nCr(int n,int r){
            int facte=1,nfactorial=1,n_rfactorial=1,r_factorial=1;
             for (int i = 1; i <=n ; i++) {
                 nfactorial=nfactorial*i;
             } 
             for (int i = 1; i <= r; i++) {
                r_factorial=r_factorial*i;
             }
             for (int i = 1; i <= (n-r); i++) {
                n_rfactorial=n_rfactorial*i;
             }
             facte=nfactorial/(n_rfactorial*r_factorial);
            return facte;
    }
    public static void main(String[] args) {
        int n=6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {

                System.out.print(nCr(i,j)+" ");
            }
            System.out.println();
        }
    }
}
