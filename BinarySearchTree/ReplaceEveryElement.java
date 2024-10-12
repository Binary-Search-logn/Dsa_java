package BinarySearchTree;

public class ReplaceEveryElement {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    static  Node succ ;
    static  Node root ;

    public ReplaceEveryElement() {
        root = null ;
        succ = null ;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
           root = new Node(data) ;

        }
        if(data < root.data) {
            succ = root ;
            root.left = insert(root.left, data) ;
        }
        else if(data >root.data) {
            root.right = insert(root.right, data) ;
        }
        return root ;
    }

    public static void replace(int arr[], int n) {
        for(int i=n-1 ; i>=0 ; i--) {
         succ = null ;
            root = insert(root, arr[i]) ;
          if(succ != null) {
              arr[i] = succ.data ;
          }
          else {
              arr[i] = -1 ;
          }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 8, 58, 71, 18, 31,
                32, 63, 92, 43, 3,
                91, 93, 25, 80, 28 };
        int n = arr.length;

        replace(arr, n);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
