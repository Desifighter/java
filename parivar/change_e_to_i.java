package parivar;
import java.util.Scanner;

public class change_e_to_i {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuilder word= new StringBuilder(scan.next());
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index)=='@') {
                word.delete(index, word.length());
                break;
            }
        }
        System.out.println(word);
    }
}
