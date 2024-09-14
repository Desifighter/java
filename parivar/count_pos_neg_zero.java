package parivar;
import java.util.*;
public class count_pos_neg_zero {
    public static void main(String[] args) {
         int num,poscount=0,negcount=0,zerocount=0,want=0,i=1;
         Scanner sc=new Scanner(System.in);
         System.out.println("wants to enter number press 1 of press 0 ");
         want=sc.nextInt();
        while (want==1) {
            System.out.println("Enter "+i+" number = ");
            num=sc.nextInt();
            if (num==0) {
                zerocount++;
            } else if(num>0) {
                poscount++;
            }
            else{negcount++;}
            i++;
            System.out.println("wants to enter number press 1 of press 0 ");
            want=sc.nextInt();
        }
        System.out.println("You have entered "+poscount+" positive number , "+negcount+" negative number "+"and "+zerocount+"zeros");
    }
}
