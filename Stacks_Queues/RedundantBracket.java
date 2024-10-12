package Stacks_Queues;

import java.util.Stack;

public class RedundantBracket {

     static boolean checkRedundancy(String s) {
         Stack<Character> st = new Stack<>();
         boolean isRedundant = true;
         for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             if (ch == '(' || ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                 st.push(ch);
             } else {
                 if (ch == ')') {

                     while (st.pop() != '(') {
                         char top = st.pop();
                         if (top == '*' || top == '-' || top == '/' || top == '+') {
                             isRedundant = false;
                         }
                         st.pop();
                     }
                     if (isRedundant) {
                         return true;
                     }
                     st.pop();
                 }
             }
         }
         return false;
     }

    public static void main(String[] args) {

    }
}
