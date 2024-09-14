package parivar;
public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={7,8,3,5,10},temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
