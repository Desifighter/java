package parivar;
public class SwapingTwoNumberwithoutThirdVariable {
    public static void main(String[] args) {
        
        int a=80,b=43;
        System.out.println("Value of a = "+ a+ "  Value of b = "+b);
        System.out.printf("  a = %d + %d = %d\n",a,b,a+b);
        a=a+b;
        System.out.printf("  b = %d - %d = %d\n",a,b,a-b);
        b=a-b;
        System.out.printf("  a = %d - %d = %d\n",a,b,a-b);
        a=a-b;
        System.out.println("Value of a = "+ a+ "  Value of b = "+b);

    }
}
