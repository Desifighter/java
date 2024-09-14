package parivar;
// Date getTime(): It is used to return a
// Date object representing this
// Calendar's time value.
  
import java.util.*;
public class Calendar1 {
    public static void main(String args[])
    {
        int month=8,day=14, year=2017;
            Calendar calndr = Calendar.getInstance();
            calndr.set(year,month-1,day);
            // calndr.set(Calendar.MONTH, month);
            // calndr.set(Calendar.DAY_OF_MONTH, day);
            System.out.println("The Current Date is:" + calndr.getTime());
    }

}