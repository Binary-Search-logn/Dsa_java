package backtracking;


import java.util.*;

public class mColoring {

//    The Time Complexity of the solution is O(N^2)
    public static boolean steps(int arr[] , int target) {
        for(int i=0 ; i<arr.length ; i++) {
            for(int j= i+1 ; j<arr.length ; j++) {
                if(arr[i] + arr[j]  == target) {
                    return true ;
                }
            }
        }
        return false ;
    }

//    DP Solution

}
