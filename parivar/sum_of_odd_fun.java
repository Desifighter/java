package parivar;
public class sum_of_odd_fun {
    public static int SumOfOdd(int n) {
        int sum=0;
        for (int index = 1; index <=n; index=index+2) {
            sum=sum+index;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Sum of 1 to "+n+" odd number = "+SumOfOdd(n));
    }
}
