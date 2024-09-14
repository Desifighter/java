package parivar;
class Reactangle{
    private int length;
    private int breadth;

    public Reactangle(int length,int breadth) {
        this.breadth=breadth;
        this.length=length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        
        return this.breadth*this.length;
    }
} 
class Cuboid extends Reactangle{
    private int height;

     Cuboid(int length,int breadth,int height ) {
         super(length,breadth);
         this.height=height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume(){
         return this.breadth*this.length*this.height;
    }
    
}
public class practice_2 {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(10, 12, 5);
        System.out.println("Volume of cuboid "+c.volume()+"  "+c.area());
    }
}
