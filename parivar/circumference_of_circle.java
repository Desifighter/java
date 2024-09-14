package parivar;
public class circumference_of_circle {
    public static float Circumference(int radius) {
        return 2*(22/(float)7)*radius;
    }
    public static void main(String[] args) {
        int radius=7;
        System.out.println("Circumference of "+radius+"cm radius of circle "+Circumference(radius));
    }
}
