package parivar;
public class number_pyramid_sahiwala {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int index = 1; index <=i; index++) {
              
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
