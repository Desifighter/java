package parivar;
public class DynamicArray {
    private int arr[];
    private int top = -1;
    DynamicArray(){
        arr = new int[10];
    }
    public void add(int n){
        if (top==arr.length-1) {
            int newArray[] = new int[arr.length+10];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        top++;
        arr[top] = n;
    }
    public int size(){
        return top+1;
    }

    void print(){
        System.out.print("[ ");
        for (int i = 0; i < top+1; i++) {
            if(i<top)
            System.out.print(arr[i]+", ");
            else 
            System.out.print(arr[i]);
        }
        System.out.print(" ]");
        System.out.println();
    }

    public void set(int index, int data){
        if (index>top||index<0) {
            System.out.println("Invalid index");
            return;
        }
        arr[index] = data;
    }
    public int get(int index){
        if (index>top||index<0) {
            System.out.println("Invalid index");
            return 0;
        }
        return arr[index];
    }
    
    public boolean isEmpty(){
        if (top>-1) {
            return false;
        }return true;
    }
    
    public int removeLast(){ 
        if(top>-1){
        int data = arr[top];
        top--;return data;}
        else
        {
        System.out.println("empty array");
        return 0;
    }
    
    }
}
