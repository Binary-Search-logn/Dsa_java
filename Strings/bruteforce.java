package Strings;

public class bruteforce {
    public static int searchalgo(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;

            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++) {
                if (s2.charAt(i+j)
                        != s1.charAt(j))
                    break;
            }
                if (j == M)
                    return i;

        }


        return -1;
    }
    public static void main(String[] args) {
        String s1 = "for";
        String s2 = "geeksforgeeks";
        int z= searchalgo(s1, s2) ;
        System.out.println(z);
    }
}
