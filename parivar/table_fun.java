package parivar;
public class table_fun {
    public static void table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a+" * "+i+" = "+i*a);
        }
    }
    public static void main(String[] args) {
        table(17);
    }
}
