package parivar;
public class floyeds_tringle_0_1 {
    public static void main(String[] args) {
        int n=8,digit=1,count=1;
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(digit+" ");

                
                if (count%2 !=0) {
                    digit--;
                }
                else{digit++;};
                count++;

            }
            System.out.println();
        }
    }
}
