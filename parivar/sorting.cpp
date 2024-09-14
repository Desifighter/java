public class Solution {

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        //Bubble sort

        // for (int i = 0; i < arr.length-1; i++) {
            
        //     for (int j = 0; j < arr.length-1-i; j++) {
                
        //         if (arr[j]>arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        //selection sort

        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i]>arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        
         
        //insertion sort

        for (int i = 1; i < arr.length; i++) {
            int current  = arr[i];
            int j = i-1;
            while (j>=0&&current<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}