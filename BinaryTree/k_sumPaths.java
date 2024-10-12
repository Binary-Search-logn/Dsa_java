package BinaryTree;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Vector;

public class k_sumPaths {
    static Vector<Integer> path = new Vector<Integer>();

    static class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }

    ;

    static void printKPath(Node root, int k) {
        if (root == null) {
            return;
        }
        path.add(root.data) ;
        printKPath(root.left, k);
        printKPath(root.right, k);


        int sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
           if(sum == k) {
               for(int m = i ; m<path.size() ; m++) {
                   System.out.print(path.get(m));
               }
               System.out.println();
           }
        }
        path.remove(path.size()-1) ;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);

        int k = 5;
        printKPath(root, k);
    }
}
