package parivar;
public class decimal_to_binary {
       static int DtB(int b) {
        int a=2,bibary=0,i=1,c,d;
        while (b!=1&&b!=0) {
            c=b%a;
            d=b/a;
            b=d;
            bibary=bibary+c*i;
            i=i*10;
        }
        bibary=bibary+b*i;
        System.out.println(bibary);
        return bibary;
    }
    static int BtD(int n){
        int b=0,dec=0,i=1;
        while (n!=0) {
            b=n%10;
            n=n/10;
            
            dec=dec+b*i;
            i=2*i;

        }
        return dec;
    }
    public static void main(String[] args) {
        int n=13,binary=DtB(n),bin=1010;
        System.out.println("Binary of "+n+" is = "+binary);
        System.out.println("Decimal of "+bin+" is = "+BtD(bin));
    }
}
