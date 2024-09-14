package parivar;

public class SolutionArrayRecursion {
    // public static int find(int[] n ,int element){
    //     int lastIndex = n.length-1;
    //     return find(n, lastIndex, element);
	// }
    // private static int find(int[] n ,int index,int element){
    //     if (-1==index) {
    //         return -1;
    //     }
    //     else if (n[index]==element) {
    //         return index;
    //     }
    //     else{
    //         return find(n, index-1, element);
    //     }
	// }
    public static int[] occo(int[]a ,int element,int idx,int fxf){
        if (a.length==idx) {
            int[] arr = new int[fxf];
            return arr;
        }
        else if(a[idx]==element){
            fxf++;
            idx++;
            int[] arr = occo(a, element, idx, fxf);
            arr[fxf-1] = idx-1;
            return arr;
        }
        else{
            idx++;
            return occo(a, element, idx, fxf);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,12,41,1,34,4,33,2,2,1};
        int[] ans = occo(a, 1, 0, 0);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        
    }
}