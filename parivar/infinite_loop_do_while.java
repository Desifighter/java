package parivar;
public class infinite_loop_do_while {
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println(i);
            i++;
        } while (i>0);
    }
}
