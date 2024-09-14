package parivar;
public class Fraction {
    private int numerator = 1;
    private int denominator = 1;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplyfy();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            // error
            // throw new ArithmeticException("can't divide by 0 ");
            System.out.println("can't divide by 0 ");
        }
        else{
            this.denominator = denominator;
            simplyfy();
        }
        
    }

    public void add(Fraction f){
        
        this.setNumerator(this.getNumerator() * f.getDenominator() + f.getNumerator() * this.getDenominator());

        this.setDenominator(this.getDenominator() * f.getDenominator());
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            // error
            // throw new ArithmeticException("can't divide by 0 ");
            System.out.println("can't divide by 0 ");
            return;
            
        }
        this.denominator = denominator;
        simplyfy();
    }

    private void simplyfy() {
        int gcd = 1;
        for (int i = 2; i <= Math.min(this.numerator, this.denominator); i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    public void print(){
        if(denominator!=1)
        System.out.println(numerator+"/"+denominator);
        else
        System.out.println(numerator);
    }

    public void multiply(Fraction f){
        this.numerator = this.numerator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplyfy();
    }

    public static Fraction multiply(Fraction f1 ,Fraction f2){
        return new Fraction(f1.numerator * f2.numerator, f1.denominator * f2.denominator);
    }
}
