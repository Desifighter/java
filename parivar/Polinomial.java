package parivar;
public class Polinomial {
    private int[] polArr = new int[100];

    





    
    
    public void setCoefficient(int degree, int Coefficient){
        polArr[degree] = Coefficient;
    }

    public void print() {
        for (int i = 0; i < polArr.length; i++) {
            if (polArr[i]!=0) {
                System.out.print(polArr[i]+"x^"+i+" + ");
            }
            
        }
        System.out.println();
    }

    public void add(Polinomial p) {
        for (int i = 0; i < polArr.length; i++) {
            this.polArr[i] = this.polArr[i] + p.polArr[i];
        }
    }

    public void multiply(Polinomial p){
        int arr[] = polArr.clone();

        for (int i = 0; i < arr.length; i++) {
            this.polArr[i] = 0;
        }

        for (int i = 0; i < 100; i++) {
            int j = 0;
            int degree = i;

            
            while (j<100&&degree<100) {
                this.polArr[degree] = this.polArr[degree] + p.polArr[i] * arr[j];
                j++;
                degree++;
            }
        }
    }

}
