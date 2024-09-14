package parivar;
public class format {
    public static void main(String[] args) {
        int number = 1;        
        String str = String.format("%04d", number);  // 0009      
        System.out.printf("original number %d, numeric string with padding : %s",
                     number, str);
    }
}
