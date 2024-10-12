package BinarySearchTree;

import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data ;
        }
    }

   public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val) ;
            return root ;
        }
        if(root.data>val) {
            root.left = insert(root.left, val) ;
        }
        else {
            root.right = insert(root.right, val) ;
        }
        return root ;
   }
   public static void inorder(Node root) {
        if(root == null) {
            return ;
        }
        inorder(root.left);
       System.out.print(root.data + " ")  ;
       inorder(root.right) ;
   }
   public static boolean search (Node root, int key) {
        if(root == null){
            return false ;
        }
        if(root.data > key) {
            return search(root.left, key) ;
        }

        else if(root.data<key) {
            return search(root.right, key) ;
        }
        else {
           return true ;
       }
   }
  public static Node deleteNode(Node root , int val) {
//        This is Searching of Deletion of Node
        if(root.data > val) {
           root.left =  deleteNode(root.left, val) ;
        }
        else if(root.data <val ) {
            root.right = deleteNode(root.right, val) ;
        }
        else {
//            Case 1 : (Leaf Node)
            if(root.left == null && root.right == null) {
                return null ;
            }
//            Case 2 : (one Node)
           if(root.left == null ) {
               return  root.right ;
           }
           if(root.right == null) {
               return root.left ;
           }
//           Case 3 : (two Nodes)
          Node Is = InorderSuccessor(root.right) ;
           root.data = Is.data ;
           root.right = deleteNode(root.right, Is.data) ;
        }
        return root ;
  }
  public static Node InorderSuccessor(Node root) {
       while(root.left != null) {
           root = root.left ;
       }
       return root ;
  }


   public static void printInRange(Node root, int x, int y) {
        if(root == null) {
            return  ;
        }
        if(root.data >= x && root.data <=y) {
            printInRange(root.left, x, y) ;
            System.out.println(root.data + " ") ;
            printInRange(root.right, x, y) ;
        }
        if(root.data >=y) {
            printInRange(root.left, x, y) ;
        }
        else {
            printInRange(root.right, x,y);
        }
   }
   public static void printPath(ArrayList<Integer> path) {
        for(int i=0 ; i<path.size()  ;i++) {
            System.out.print(path.get(i) + "->") ;
        }
       System.out.println();
   }
   public static void RootToLeafPaths(Node root, ArrayList<Integer> list) {
     if(root == null) {
         return ;
     }
       list.add(root.data ) ;
     if(root.left == null && root.right == null) {
         printPath(list);
     }else {

         RootToLeafPaths(root.left, list);
         RootToLeafPaths(root.right, list);

     }
       list.remove(list.size()-1) ;
   }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i=0 ; i<values.length ; i++) {
            root = insert(root, values[i]) ;
        }
     RootToLeafPaths(root, new ArrayList<>());
//        System.out.println(Inorder(root,  ));
    }
}
