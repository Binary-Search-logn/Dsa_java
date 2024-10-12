package BinaryTree;

import java.util.HashMap;

public class MaximumSumOfNodes {
    static  class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public static int getMaxSumUtil(Node root, HashMap<Node, Integer> dp) {
        if(root== null) {
            return 0 ;
        }
        if(dp.containsKey(root)) {
            return dp.get(root) ;
        }
        int inc = root.data ;
        if(root.left != null) {
            inc += getMaxSumUtil(root.left.left, dp) ;
            inc += getMaxSumUtil(root.left.right, dp) ;
        }
        if(root.right != null) {
            inc += getMaxSumUtil(root.right.left ,dp) ;
            inc += getMaxSumUtil(root.right.right, dp) ;
        }
         int exc =  getMaxSumUtil(root.left , dp) + getMaxSumUtil(root.right , dp) ;
        dp.put(root, Math.max(inc, exc )) ;

        return dp.get(root) ;
    }

    public static int getMaxSum(Node root) {
        if(root== null) {
            return 0 ;
        }
        HashMap<Node, Integer> map = new HashMap<>() ;
        return getMaxSumUtil(root, map) ;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(1);
        System.out.print(getMaxSum(root));
    }


}
