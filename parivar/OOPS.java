package parivar;
/**
 * Student
 */
class Student {
          String name;
          int rollno;
          public  void printfname() {
              System.out.println("Name = "+name+"\nRollnumber = "+rollno);
          }
          
    
}
public class OOPS {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="keshav keshari";
        s1.rollno=1000;
        
        Student s2=new Student();
        s2.name="madhav";
        s2.rollno=1001;
        s2.printfname();
        s1.printfname();

    }
}
