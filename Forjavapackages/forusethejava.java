
import com.codewithharry.shape.Circle;
import com.codewithharry.shape.Sphere;
public class forusethejava {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println(c.perimeter());  
        System.out.println(c.area());
        Sphere s = new Sphere();
        s.setRadius(7);
        System.out.println( s.volume());
       
        
        
    }
}
