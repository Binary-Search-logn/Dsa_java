package BinaryTree;

import java.util.HexFormat;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversals {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(  function(root) ) ;
//        System.out.print(HeightOfTheTree(root) );

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public static void PostOrder(Node root) {
        if (root == null) {
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data + " ");
    }

    public static void LevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>() ;
        q.add(root) ;
        q.add(null) ;
        while(!q.isEmpty()){
            Node curr = q.poll() ;
            if(curr == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                q.add(null) ;
            }
            else {
                System.out.print(curr.data + " ") ;
                if(curr.left != null) {
                    q.add(curr.left) ;
                }
                if(curr.right != null) {
                    q.add(curr.right) ;
                }
            }
        }

    }
    public static Node mirrorTree(Node root) {
        if(root == null) {
            return null ;
        }
        Node left = mirrorTree(root.left) ;
        Node right = mirrorTree(root.right) ;
        root.left = right ;
        root.right = left ;
        return root ;
    }
//    Next We will find the height of the binary tree
     public static int HeightOfTheTree(Node root) {
        if(root == null) {
            return 0 ;
        }
        int leftHeight = HeightOfTheTree(root.left);
        int rightHeight = HeightOfTheTree(root.right) ;

        return Math.max(leftHeight , rightHeight) + 1 ;
    }

    public static void diagonalPrint(Node root) {
        if(root == null) {
            return ;
        }
        Queue<Node> q = new LinkedList<>( );
        q.add(root) ;

        while(!q.isEmpty()) {
            Node temp = q.peek() ;
            q.remove() ;
            while(temp != null) {
                System.out.println(temp.data + " ") ;
                if(temp.left != null) {
                    q.add(temp.left) ;
                }
                temp = temp.right ;
            }
        }
    }

//    This function is to determined the diametre of the height
     public static int diametre(Node root) {
        if(root == null) {
            return  0 ;
        }
        int diam1 = diametre(root.left) ;
        int diam2 = diametre(root.right) ;
        int diam3 = HeightOfTheTree(root.left) + HeightOfTheTree(root.right) + 1 ;
        return Math.max(diam1 , Math.max(diam2, diam3))  ;
     }
//      Reverse Level Order Traversal


    static int isSumTree(Node root) {
        if(root== null) {
            return 0 ;
        }
        if(root.left == null || root.right == null) {
            return root.data ;
        }
        int l = isSumTree(root.left) ;
        int r = isSumTree(root.right) ;

        if(root.data == (l+r)) {
            return 1 ;
        }
        return 0 ;
    }


//    Find Largest SubTree Sum in a tree
public static int function(Node root) {
    if(root == null) {
        return 0 ;
    }
    int ma =0 ;
    int l = function (root.left) ;
    int r = function(root.right) ;
    ma = Math.max(ma, l +  r + root.data) ;
    return ma  ;
}

}

