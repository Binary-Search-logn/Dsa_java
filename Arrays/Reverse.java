package Arrays;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9} ;
        int n =arr.length ;
        Stack<Integer> stack = new Stack<>() ;
        for(int i=0; i<n; i++) {
            stack.push(arr[i]);
        }
        for(int i=0; i<n; i++) {
            System.out.println(stack.pop());
        }
    }
}
