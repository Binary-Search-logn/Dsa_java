package backtracking;

import java.util.HashSet;
import java.util.Stack;

public class RemoveInvalidParenthesis {

    public static int getMin(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0 || st.peek() == ')') {
                    st.push(ch);
                } else if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        return st.size();
    }


    public static void solution(String str, int minRemoval, HashSet<String> ans) {
        if (IsValid(str)) {
            if (!ans.contains(str)) {
                System.out.println(str);

                ans.add(str);
            }
            return;
        }

        if (minRemoval == 0) {
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String left = str.substring(0, i);
            String
                    right = str.substring(i + 1);
            solution(left + right, minRemoval - 1, ans);
        }
    }

    public static void main(String[] args) {
        String s = "()())()";
        solution(s, getMin(s), new HashSet<>());
    }

    private static boolean IsValid(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '('
            ) {
                count++;
            } else if (ch == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;


    }
}
