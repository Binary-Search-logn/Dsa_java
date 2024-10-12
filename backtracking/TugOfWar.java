package backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class TugOfWar {
//    The question Says that :
//    Given a set of N integers divide the set in two subsets of n/2 sizes each such that the absolute difference of the sum of two subsets is as minimum as possible .
    public static void main(String[] args) {
    int arr[] = {3, 4, 5, -3, 100, 1, 89, 54, 23, 20} ;
         solve(arr, 0 , new ArrayList<>(), new ArrayList<>(), 0, 0) ;
        System.out.println(ans);
    }
    static int minDiff = Integer.MAX_VALUE ;
    static String ans = "" ;

    public static void solve(int [] arr, int vidx, ArrayList<Integer> set1, ArrayList<Integer> set2, int soset1, int soset2) {

        if(vidx == arr.length) {
            int delta = Math.abs(soset1 - soset2) ;
            if(delta<minDiff) {
                minDiff = delta ;
                ans = set1 + " " + set2 ;
            }
        }
        if(set1.size() < (arr.length+1) /2) {
            set1.add(arr[vidx]) ;
            solve(arr, vidx+1, set1, set2, soset1 + arr[vidx] , soset2) ;
            set1.remove(set1.size() -1) ;
        }
        if(set2.size() < (arr.length+1)/2) {
            set2.add(arr[vidx]) ;
            solve(arr, vidx+1, set1, set2, soset1, soset2+ arr[vidx]) ;
            set2.remove(set2.size() -1) ;
        }

    }
}
