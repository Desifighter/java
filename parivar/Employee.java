package parivar;
class TommyVecetti{
    int salary;
    public void hit(){
        System.out.println("hitting...");
    }
    public void run(){
        System.out.println("running...");
    }
    public void fire(){
        System.out.println("firing...");
    }
    public TommyVecetti(){
        salary=1000;
    }
    public TommyVecetti(int n){
        salary=n;
    }
    public int getSalary(){
        return salary;
    }
}
public class Employee {
   public static void main(String[] args) {
       TommyVecetti rockstar=new TommyVecetti(8000);
      System.out.println(rockstar.getSalary());
   }
}
