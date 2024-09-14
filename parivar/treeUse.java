package parivar;
import java.util.ArrayList;
import java.util.Scanner;

public class treeUse {
    public static treeNode<Integer> takeInput(Scanner sc) {
        int n;
        System.out.println("Enter next node data :");
        // Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        treeNode<Integer> root = new treeNode<Integer>(n);
        System.out.println("Enter number of children for "+n+" : ");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            treeNode<Integer> node = takeInput(sc);
            
            root.children.add(node);
        } 
        return root;
        
    }
    public static void printTree(treeNode<Integer> root){
        System.out.print(root.data+" : ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            printTree(root.children.get(i));
        }
    }
    public static void main(String[] args) {
        // treeNode<Integer> root = new treeNode<Integer>(4);
        // treeNode<Integer> node1 = new treeNode<Integer>(1);

        // treeNode<Integer> node2 = new treeNode<Integer>(2);

        // treeNode<Integer> node3 = new treeNode<Integer>(3);

        // treeNode<Integer> node4 = new treeNode<Integer>(4);

        // treeNode<Integer> node5 = new treeNode<Integer>(5);

        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);

        // node2.children.add(node4);
        // node2.children.add(node5);

        // System.out.println(root);
        // node1.printTree(root);
        Scanner sc = new Scanner(System.in);

        treeNode<Integer> root = treeUse.takeInput(sc);
        treeUse.printTree(root);
        

    }
}
