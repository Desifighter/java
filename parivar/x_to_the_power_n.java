package parivar;
public class x_to_the_power_n {
    public static int XkipowerN(int x,int n) {
        int result=1;
        for (int index = 1; index <=n; index++) {
            result=result*x;
        }
        return result;
    }
    public static void main(String[] args) {
        int x=1,n=1;
        System.out.println("1 to the power 0 is ="+XkipowerN(x, n));
    }
}
