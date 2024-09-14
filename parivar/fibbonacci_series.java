package parivar;
public class fibbonacci_series {
    public static void main(String[] args) {
        int n1=0,n2=1,num=10,n3;
        for (int i = 1; i <= num; i++) {
            if (i==1) {
                System.out.println(0);
            }
            else if (i==2) {
                System.out.println(1);
            }
            else{
                 n3=n1+n2;
                 System.out.println(n3);
                 n1=n2;
                 n2=n3;
            }
        }
    }
}
