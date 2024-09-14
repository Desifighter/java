package parivar;


class Cylinder{
     private int height,radius;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public Cylinder() {
    }
     

    
     
}
public class practice_9 {
    public static void main(String[] args) {
        Cylinder A=new Cylinder();
        //A.setHeightAndRadius(23, 18);
        System.out.println("Surface area of cylinder "+A.surfaceArea()+"\nvolume is "+A.volume());
    }
}
