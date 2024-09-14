//package com.codewithharry.shape;

class c1{
    public void fun1()
    {
        System.out.println("Fun zone with public ");
    }
    protected void fun2()
    {
        System.out.println("Fun zone with proctected ");
    }
     void fun3()
    {
        System.out.println("Fun zone with default ");
    }
    private void fun4()
    {
        System.out.println("Fun zone with private ");
    }
       

     
}
class c2 extends c1{
        public void hello(){
               fun3();
        }
}
class c3 extends c2{

}
public class AccessModifier {
    public static void main(String[] args) {
        c2 h = new c2();
        h.fun3();
        
    }
}
