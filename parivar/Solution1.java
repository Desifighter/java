package parivar;
import java.util.* ;
import java.io.*; 
public class Solution1 {
    public static long getTrappedWater(long[] arr, int n) {
        if(n==1||n==0||n==2) return 0;
        // Write your code here.
        long fhigh = Long.MIN_VALUE;
        int idx1 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (fhigh<arr[i]) {
                fhigh = arr[i];
                idx1 = i;
            }
        }

        long shigh = Long.MIN_VALUE;
        int idx2 = -1;

        for(int i = 0; i < arr.length; i++){
            if (shigh<arr[i]&&arr[i]!=fhigh) {
                shigh = arr[i];
                idx2 = i;
            }
        }

        long water = calculateWater(arr,idx1,idx2)+getTrappedWater(arr, Math.min(idx1,idx2)+1)+
        getTrappedWater(arr,Math.max(idx1,idx2),arr.length-1)+0;

        return water;
        
        
    }

    static long getTrappedWater(long[] arr, int first , int second) {
        if(first-second<=1) return 0;
        long fhigh = first;
        long shigh = Long.MIN_VALUE ;int idx2 = -1;

        for(int i = first+1; i <= second ; i++){
            if(arr[i]>shigh){
                shigh = arr[i];
                idx2 = second;
            }
        }
long water = 0;
        water = calculateWater(arr,first,idx2)+getTrappedWater(arr,idx2,arr.length-1);
        return water;
    }
    public static long calculateWater(long[] a,int f_h_idx, int s_h_idx){
        int min = Math.min(f_h_idx, s_h_idx);
        int max = Math.max(f_h_idx, s_h_idx);

        long vmin = Math.min(a[f_h_idx], a[s_h_idx]);
        
        long water = 0;

        for (int i = min+1; i < max; i++) {
            water = water + (vmin - a[i]);
        }

        return water;
    }
}

