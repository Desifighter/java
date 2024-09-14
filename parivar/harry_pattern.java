package parivar;


public class harry_pattern {
    static void change(int a[]){
        a[0]=23;
    }
    public static void main(String[] args) {
       int zar[]={3,1,4,0,-6},temp=zar[0];
       change(zar);
       for (int i : zar) {
        System.out.println(i);
    } 
    }
}
