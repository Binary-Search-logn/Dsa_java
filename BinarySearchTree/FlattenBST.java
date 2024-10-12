package BinarySearchTree;

public class FlattenBST {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            left = null;
            right = null;

        }
    }
    static node prev  ;
    static void inorder(node curr) {
        if(curr == null) {
            return ;
        }
        inorder(curr.left) ;
        prev.left = null ;
        prev.right = curr ;
        prev = curr;
        inorder(curr.right) ;

    }
    static node flattern(node parent) {
        node dummy = new node(-1) ;
         prev = dummy ;
        inorder(parent) ;
        prev.right = null ;
        prev.left = null ;
        node ret = dummy.right ;
        return ret ;
    }
   static void print(node parent) {
        node curr = parent ;
        while(curr!= null) {
            System.out.println(curr.data + " ") ;
          curr = curr.right ;
        }

   }
    public static void main(String[] args) {
        node root = new node(5);
        root.left = new node(3);
        root.right = new node(7);
        root.left.left = new node(2);
        root.left.right = new node(4);
        root.right.left = new node(6);
        root.right.right = new node(8);
          print(flattern(root)) ;
    }
}