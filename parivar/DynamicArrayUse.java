package parivar;
public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        arr.removeLast();
        // arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.print();
        
        System.out.println(arr.removeLast());
        arr.removeLast();
        System.out.println(arr.size());
        arr.print();
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        // arr.removeLast();
        arr.removeLast();arr.removeLast();
        arr.removeLast();arr.removeLast();arr.removeLast();
        arr.print();
        System.out.println(arr.isEmpty());

    }
}
