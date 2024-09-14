package parivar;
public class Greater_of_two {
    public static int AorB(int a,int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int a=278,b=567;
        System.out.println("278 aur 567 me kon bada hai "+AorB(a, b));
    }
}
