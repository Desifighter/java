package parivar;
public class check_array_ascending_order {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int min=arr[0],check=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                
                check=1;
                break;
            }
        }
        if (check==0) {
            System.out.println(" in ascending order");
        } else {
            System.out.println("Not in ascending order");
        }
    }
}
