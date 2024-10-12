package heaps;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConvertBStToMinheap {
    static class Node {
        int data ;
        Node left , right ;
        Node() {
            this.data = 0 ;
            this.left = this.right = null ;
        }
        Node(int data ) {
            this.data = data ;
            this.left = this.right = null ;
        }
    }
    private  static void preorder(Node root) {
        if(root == null) {
            return ;
        }
        System.out.println(root.data + " ") ;
        preorder(root.left) ;
        preorder(root.right) ;
    }
    private static void BSTtoArr(Node root, ArrayList<Integer> list ) {
        if(root == null) {
            return ;
        }
        BSTtoArr(root.left , list) ;
        list.add(root.data) ;
        BSTtoArr(root.right, list) ;
    }
    static int index ;
    private static void arrToMinHeap(Node root , ArrayList<Integer> arr) {
        if(root == null) {
            return ;
        }
        root.data = arr.get(index++) ;
        arrToMinHeap(root.left, arr) ;
        arrToMinHeap(root.right, arr) ;
    }
}
