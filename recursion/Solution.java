import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    // sum of n natural num by recursion
    static int sumOfN(int n){
        if (n==0) {
            return 0;
        }
        return n + sumOfN(n-1);
    }
    // factorial
    static int fact(int n){
        if(n==0||n==1)return 1;
        else return n * fact(n-1);
    }

    // reverse an array
    static void revArray(int[] arr, int start, int end){
        if (start>=end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        revArray(arr, start+1, end-1);
    }

    //Print array
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //palindrome string
    static boolean isPalindrome(String str){
        if (str.length()<=1) {
            return true;
        }
        else if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        } 
        else{
            return isPalindrome(str.substring(1, str.length()-1));
        }
    }
    
    //fibonacci
    static int fib(int n){

        if(n==0)return 0;
        
        if(n==1)return 1;
        else{
            return fib(n-1)+fib(n-2);
        }

        
    }
    
    //when using array
    static void printArray(int[]arr, int i){
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    static void printSubseq(int[] arr, int[] sub, int i,int j){
        if (arr.length==i) {
            printArray(sub,j);
        }
        else{
            printSubseq(arr, sub, i+1,j);
            sub[j] = arr[i];
            printSubseq(arr, sub, i+1,j+1);
            
        }
    }

    static boolean printSubseq(int[] arr, ArrayList<Integer> list, int i,int sum,int k){
        
        if (sum>k) {
            return false;
        }
        else if(sum==k){
            System.out.println(list);
            return true;
        }
        else if (arr.length==i) {
        
            return false;
        }
        else{
            
            list.add(arr[i]);
            sum = sum + arr[i];
            boolean check1 = printSubseq(arr, list, i+1,sum,k);
            if (check1) {
                return true;
            }
            list.remove(list.size()-1);
            sum = sum - arr[i];
            return printSubseq(arr, list, i+1,sum,k);
        }
    }

    static int printSubseq(int[] arr, int i,int sum,int k,int count){
        
        if (sum>k) {
            return 0;
        }
        else if(sum==k){
            
            return 1;
        }
        else if (arr.length==i) {
        
            return 0;
        }
        else{
            
            
            sum = sum + arr[i];
            int a = printSubseq(arr, i+1,sum,k,count);
            
        
            sum = sum - arr[i];
            int b = printSubseq(arr,i+1,sum,k,count);
            return a+b;
        }
    }

    static void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int[] nums = new int[r-l+1];
         int a = l;
         int sl = m+1;
         
         int i = 0;
         while (l<=m && sl<=r) {
            if (arr[l]<arr[sl]) {
                nums[i] = arr[l];
                i++;
                l++;
            }
            else{
                nums[i] = arr[sl];
                i++;
                sl++;
            }
         }
         while (l<=m) {
            nums[i] = arr[l];
                i++;
                l++;
         }
         while (sl<=r) {
            nums[i] = arr[sl];
                i++;
                sl++;
         }

         for (int j = 0; j < nums.length; j++) {
            arr[a] = nums[j];
            a++;
         }
    }

    
    

    public static void main(String[] args) {
        int[] arr = {-1, -4, 1, 3, -2000};
        
        
        int low = 0, high = 4;

        int pivot = arr[0];

        int i = low , j = high;
        while (i<=j) {
            if (arr[i]<=pivot) {
                i++;
            }
            else if (arr[j]>=pivot) {
                j--;
            }
            else{
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }
        int temp = arr[j];
        arr[j] = arr[0];
        arr[0] = temp;




        printArray(arr);

    }
}



