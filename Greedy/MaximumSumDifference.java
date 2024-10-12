package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSumDifference {

    public static int maxSum ( int arr[], int n) {
        List<Integer> list = new ArrayList<>() ;

        Arrays.sort(arr) ;

        for(int i=0 ; i<n/2 ;i++) {
            list.add(arr[i]) ;
            list.add(arr[n-i-1]) ;
        }
//        if there are the odd elements in the array
        if(n%2 != 0) {
            list.add(arr[n/2]) ;
        }

        int maxSum =0 ;
        for(int i=0 ; i<n-1 ;i++) {
            maxSum += Math.abs(list.get(i) - list.get(i+1)) ;
        }
        maxSum += Math.abs(list.get(n-1) - list.get(0)) ;
        return maxSum ;
    }
    public static void main(String[] args) {
        int n= 4;
        int arr[] = {1, 2, 4, 8} ;
        int x = maxSum(arr, n) ;
        System.out.println(x) ;
    }
}
