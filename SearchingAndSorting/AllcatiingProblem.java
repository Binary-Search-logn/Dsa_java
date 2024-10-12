package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class AllcatiingProblem {
    static boolean isPossible(int arr[], int n, int m, int barrier) {
         int allocatedStudents = 1 ;
         int pages =0 ;

         for(int i=0 ;i<n ; i++) {
//             Check the element is greater than barrier or not if it's  return false
             if(arr[i] > barrier) {
                 return false ;
             }

             if(pages + arr[i]> barrier) {
                    allocatedStudents ++ ;
                    pages = arr[i] ;
             }
             else {
                 pages += arr[i] ;
             }
//             In This creteria students is 2 if it is beyond the 2 then return false;
             if(allocatedStudents > m) {
                 return false ;
             }
         }
         return true ;
    }
    static int findPages(int arr[], int n, int m) {

        int result = Integer.MAX_VALUE;
        if (n < m) {
            return -1;
        }
        int low = arr[0];
        int high = 0;
        for (int i = 0; i < n; i++) {
            high = high + arr[i];
            low = Math.min(low, arr[i]);
        }
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (isPossible(arr, n, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return result;
    }
    public static void main(String[] args) {
       int arr[]  = {12, 34, 67, 90} ;
       int m = 2 ;
       int n = arr.length ;
        System.out.println("Minimum number of pages : " + findPages(arr,  n, m)) ;
    }
}
