package parivar;
/**
 * Solution
 */
public class Solution {
    static void one2n(int n, int i){
        if (i>n) {
            return;
        }
        one2n(n,i+1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 5;
        one2n(n,1);
// 
    }
}

