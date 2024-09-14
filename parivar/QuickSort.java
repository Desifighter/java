package parivar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void quickSort(int[] arr, int si, int ei) {
        if (si>=ei) {
            return;
        }
        int[] copy = new int[ei-si+1];
        int pivot = arr[si];
        int left = si, right = ei;
        for (int i = 1; i < copy.length; i++) {
            if (arr[i]<=pivot) {
                copy[left] = arr[i];left++;
            }
            else{
                copy[right] = arr[i];right--;
            }
        }
        copy[left] = pivot;
        for (int i = 0; i < copy.length; i++) {
            arr[i+si] = copy[i];
        }
        quickSort(arr, si, left-1);
        quickSort(arr, left+1, ei);
    }
    public static void main(String[] args) {
        
         int[] arr = new int[]{42, 37, 35, 14, 17, 10, 50 ,20, 44 ,13, 4 ,33, 12, 28, 7, 36, 46, 22, 26, 21, 47, 18 ,31, 2 ,5, 34, 9, 45, 16 ,32, 48, 19, 11, 29, 27, 39, 8 ,49, 43};
         Arrays.sort(arr);
        //quickSort(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
