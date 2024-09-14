package parivar;
public class count_1s {
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
    static int count(int n){
        int b,counts=0;
        while (n!=0) {
            b=n%10;
            n=n/10;
            if (b==1) {
                counts++;
            }
            

        }
        return counts;
    }
    public static void main(String[] args) {
        int n=11,binay=DtB(n);
        System.out.println("n="+n+" binary="+binay+" 1's count = "+count(binay));
    }
}
