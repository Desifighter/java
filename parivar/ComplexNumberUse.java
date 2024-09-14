package parivar;
public class ComplexNumberUse {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4) , c2 = new ComplexNumber(0, 1);

        ComplexNumber.multiply(c1, c2).print();

    }
}
