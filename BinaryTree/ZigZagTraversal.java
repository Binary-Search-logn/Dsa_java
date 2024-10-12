package BinaryTree;

import java.util.*;

public class ZigZagTraversal {
    static class Node {

        public int data;
        public Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // A utility function to create a new node
    static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }

    static ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>() ;
        if(root == null) {
            return ans ;
        }
       Queue<Node> q = new LinkedList<>() ;
        q.add(root) ;
        boolean lefttoright = true ;
       while(q.size()>0) {
           int size = q.size() ;
           ArrayList<Integer> temp = new ArrayList<>() ;
           for(int i=0 ; i<size ; i++) {
               Node curr = q.poll() ;
               if(curr.left != null) {
                   q.add(curr.left) ;
               }
               if(curr.right != null) {
                   q.add(curr.right) ;
               }
               temp.add(curr.data) ;
           }
           if(lefttoright == false) {
               Collections.reverse(temp) ;
           }
           for(int i=0 ; i<temp.size() ; i++) {
               ans.add(temp.get(i))  ;
           }
           lefttoright = !(lefttoright) ;

       }
       return ans ;
    }

    public static void main(String[] args) {

        // Arraylist to store the traversal order.
        ArrayList<Integer> ans;

        // create tree
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(7);
        root.left.right = newNode(6);
        root.right.left = newNode(5);
        root.right.right = newNode(4);
        System.out.println(
                "ZigZag Order traversal of binary tree is");

        ans = zigZagTraversal(root);

        for (int i = 0; i < ans.size();
             i++) { // to print the order
            System.out.print(ans.get(i) + " ");
        }
    }
}
