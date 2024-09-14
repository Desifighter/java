package parivar;
public class ComplexNumber {
    private int real;
    private int img;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public void add(int real, int img) {
        this.real = this.real + real;
        this.img = this.img + img;
    }

    public void add(ComplexNumber c){
        this.real = this.real + c.real;
        this.img = this.img + c.img;
    }

    public void multiply(int real, int img) {
        this.real = this.real * real - img * this.img;
        this.img = real * this.img + this.real * img; 
    }

    public void multiply(ComplexNumber c) {
        this.real = this.real * c.real - c.img * this.img;
        this.img = c.real * this.img + this.real * c.img; 
    }

    void conjugate(){
        this.img = -1 * this.img;
    }

    void print(){
        if(img>=0)
        System.out.println(real+" + i"+img);
        else
        System.out.println(real+" - i"+Math.abs(img));
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real+c2.real,c1.img+c2.img);
    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real * c2.real - c2.img * c1.img, c2.real * c1.img + c1.real * c2.img);
    }
}
