package backtracking;

import java.util.Scanner;

public class FindMaximum {
    public static String swap(String str, int i ,int j) {
        char ith = str.charAt(i) ;
        char jth = str.charAt(j) ;
        String left = str.substring(0, i) ;
        String middle = str.substring(i+1, j) ;
        String rightt = str.substring(j+1) ;
        return left + jth + middle + ith + rightt ;
    }
    static String max;
    public static void findMaximum(String str, int k) {
        if(Integer.parseInt(str) > Integer.parseInt(max)) {
            max = str ;
        }
        if(k==0 ) {
            return ;
        }

        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<str.length() ; j++) {
                if(str.charAt(i) > str.charAt(j)) {
                     String swapped = swap(str, i, j) ;
                     findMaximum(swapped, k-1) ;
                }
            }
        }

    }
    public static void main(String[] args) {
        String str = "1234567" ;
        int k = 4 ;
        max = str;
        findMaximum(str, k);
        System.out.println(max);
    }
}
