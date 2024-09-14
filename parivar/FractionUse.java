package parivar;
public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(10, 30);
        f1.print();

        // f1.setDenominator(0);
        f1.setNumerator(100);
        f1.print();

        f1.add(new Fraction(200, 3));
        f1.print();

        f1.multiply(new Fraction(1, 0));
        f1.print();

        Fraction f4 = Fraction.multiply(new Fraction(4, 3), f1);
        f4.print();
    }
}
