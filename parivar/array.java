package parivar;
public class array {
    public static void main(String[] args) {
        int arr[]={23,33,1,3,4,88},x=1,i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                break;
            }
        }
        System.out.println("Index for number is = "+i);
    }
}
