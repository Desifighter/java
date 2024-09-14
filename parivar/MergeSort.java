package parivar;
// // import java.util.ArrayList;

// // public class Solution {

// //     public static void printAllSub(String str, int index,String subSe){
// //         if (index == str.length()) {
// //             System.out.println(subSe);
// //         }
// //         else{
// //             {
            
// //                 printAllSub(str, index+1,subSe+str.charAt(index));
              
// //             }
            
// //             {
// //                 printAllSub(str, index+1,subSe);
// //             }
// //         }
// //     }
// //     public static void main(String[] args) {
// //         printAllSub("abc", 0,"");

// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.size();
// //     }
// // } 

// import java.util.ArrayList;

// /**
//  * Solution
//  */
// public class Solution {
//     public static void printAllSub(int[] arr, int index, int[] subSe ,int i) {
//         if (index == arr.length) {
//             printArray(subSe, i);
//             return;
//         }
//         printAllSub(arr, index+1, subSe, i);
//         subSe[i] = arr[index];
//         printAllSub(arr, index+1, subSe, i+1);

//     }
//     public static void printAllSub(int[] arr, int index, ArrayList<Integer> list) {
//         if (index == arr.length) {
//             System.out.println(list);
//             return;
//         }
//         // printAllSub(arr, index+1, subSe, i);
//         // subSe[i] = arr[index];
//         // printAllSub(arr, index+1, subSe, i+1);

//     }

//     public static void printArray(int[] arr, int len) {
//         for (int i = 0; i < len; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
   
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};

//         printAllSub(arr, 0, new int[3],0);
        
//     }
// }



/**
 * Solution
 */
public class MergeSort {

    public static void mergesort(int[] arr, int start, int end) {
        if (start>=end) {
            return;
        }
        int mid = (start+end)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merge(arr,start,end);

    }
    private static void merge(int[] arr, int start, int end) {
        int mid = (start+end)/2;
        int[] copy = new int[end-start+1];

        int j = start, k = mid + 1;
        for (int i = 0; i < copy.length; i++) {
            if (j<=mid && k<=end) {
                if (arr[j]<arr[k]) {
                    copy[i] = arr[j];j++;
                } else {
                    copy[i] = arr[k];k++;
                }
            }
            else if (j<=mid) {
                copy[i] = arr[j];j++;
            }
            else if (k<=end) {
                copy[i] = arr[k];k++;
            }
        }
        for (int i = 0; i < copy.length; i++) {
            arr[start+i] = copy[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {11,2,3,40,15,6,37};
        // int mid = (arr.length-1)/2;
        // int[] first = new int[mid+1];
        // System.arraycopy(arr, 0, first, 0, mid+1);
        // int[] second = new int[arr.length-1-mid];
        // System.arraycopy(arr, mid+1, second, 0,arr.length-1-mid );

        // for (int i = 0; i < first.length; i++) {
        //     System.out.print(first[i]+" ");
        // }
        // // System.out.println();
        // for (int i = 0; i < second.length; i++) {
        //     System.out.print(second[i]+" ");
        // }
        mergesort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}