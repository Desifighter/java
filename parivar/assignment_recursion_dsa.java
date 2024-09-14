package parivar;
import java.util.Scanner;

public class assignment_recursion_dsa {
    static int multiplication(int a , int b){
        if (b==0) {
            return 0;
        }
        else{
            return a + multiplication(a, b-1);
        }
    }
    
    static int zeroCount(int N){
        if (N==0) {
            return 0;
        }
        else if ( N % 10 == 0){
            return 1 + zeroCount(N/10);
        }
        return zeroCount(N/10);
    }
    public static int countZerosRec(int input){
		if(input==0) //Just to handle the case when input=0 
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;			
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);

	}

    public static double findGeometricSum(int k){
        if (k==0) {
            return 1;
        }
        else{
            return 1.0/(Math.pow(2, k)) + findGeometricSum(k-1);
        }
    }

    public static boolean isStringPalindrome(String input) {
        // if (input.charAt(0)!=input.charAt(input.length()-1)) {
        //     return false;
        // }
        // else if (input.length()-1==0) {
        //     return true;
        // }
        // else if (input.length()==2&&input.charAt(0)==input.charAt(1)) {
        //     return true;
        // }
        // else if (input.length()==2&&input.charAt(0)!=input.charAt(1)) {
        //     return false;
        // }
        // else{
        //     return true&&isStringPalindrome(input.substring(1, input.length()-1));
        // }
        if (input.length()<=1) {
            return true;
        }
        else if (input.charAt(0)!=input.charAt(input.length()-1)) {
            return false;
        }
        else{
            return isStringPalindrome(input.substring(1, input.length()-1));
        }
    }

    public static String replacePi(String str){
        if(str.length()<=1){
            return str;
        }
        else if(str.substring(0,2).equals("pi")){
            return "3.14" + replacePi(str.substring(2));
        }
        return str.substring(0,1)+replacePi(str.substring(1));
    }

    public static int sumOfDigit(int num){
        if (num<10) {
            return num;
        }
        return (num%10)+sumOfDigit(num/10);
    }

    public static String removeX(String str){
        if (str.length()==0) {
            return "";
        }
        if (str.charAt(0)=='x') {
            return removeX(str.substring(1));
        }
        else{
            return str.charAt(0)+removeX(str.substring(1));
        }}

        public static int s_to_i(String s){
            if (s.length()==0) {
                return 0;
            }
            if (s.length()==1) {
                int num = s.charAt(0) - 48;
                return num;
            }
            else{
                int num = s.charAt(s.length()-1) - 48;
                return num + 10 * s_to_i(s.substring(0,s.length()-1));
            }
        }
    public static void main(String[] args) {
        // System.out.println(multiplication(1000, 1000));
        // System.out.println(zeroCount(10));
        // System.out.println(countZerosRec(10));
        // System.out.println(findGeometricSum(3));
        // System.out.println(isStringPalindrome("o"));
        // System.out.println(sumOfDigit(1000000009));
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // String s = "pi";
        // System.out.println(replacePi("xpixpi"));
        // System.out.println(removeX("xxxxxxxxxxxxxxxxxxxxx"));
        // int a = '1' - 48;
        // System.out.println(a);
        // System.out.println(s_to_i("17"));

        System.out.println(changeS(""));
    }

    public static String changeS(String str){
        if (str.length()<=1) {
            return str;
        }
        else if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0) + "*" + changeS(str.substring(1));
        }
        else{
            return str.charAt(0) +  changeS(str.substring(1));
        }
    }
    
    

    

    
}
