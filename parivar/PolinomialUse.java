package parivar;
public class PolinomialUse {
    public static void main(String[] args) {
        Polinomial p1 = new Polinomial();
        p1.setCoefficient(0, 3);
        p1.setCoefficient(2, 2);
        p1.print();

        Polinomial p2 = new Polinomial();
        p2.setCoefficient(0, 1);
        p2.setCoefficient(1, 4);
        p2.print();

        p1.add(p2);
        p1.print();

        p1.multiply(p2);
        p1.print();



        // int arr[] = new int[3];
        // int p[] = arr.clone();

        // arr[1] = 4;
    
        // for (int i = 0; i < p.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for (int i = 0; i < p.length; i++) {
        //     System.out.print(p[i]+" ");
        // }




    }
}
