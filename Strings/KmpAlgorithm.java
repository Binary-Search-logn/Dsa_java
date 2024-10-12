package Strings;

import Arrays.Palindrome;

public class KmpAlgorithm {


    public static void KMPSearch(String pat, String txt) {
        int M = pat.length() ;
        int N = txt.length() ;
    }

    public static void ComputeLPSArray(String pat, int M, int [] lps) {
        int len =0 ;
        int i = 1 ;
        lps[0] = 0 ;

        while(i<M) {
            if(pat.charAt(i) == pat.charAt(len)) {
                len ++ ;
                lps[i] = len ;
                i++ ;
            }
            else {
                if(len!= 0) {
                    len = lps[len-1] ;
                }
                else {
                    lps[i] = len ;
                    i++ ;
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        KMPSearch(pat, txt);
    }
}
