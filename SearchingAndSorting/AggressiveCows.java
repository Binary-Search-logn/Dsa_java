package SearchingAndSorting;

import java.util.Arrays;

public class AggressiveCows {
    static boolean isPossible(int arr[], int n , int cows, int mid) {
        int cntCows = 1 ;
        int lastPlacedCow = arr[0] ;
        for(int i=1 ; i<n; i++) {
            if(arr[i] -lastPlacedCow >= mid) {
                cntCows ++ ;
                lastPlacedCow = arr[i] ;
            }
        }
        if(cntCows >= cows ) {
            return  true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        int n = 5, cows = 3;
        int arr[] = {1, 2, 8, 4, 9};
         Arrays.sort(arr);
         int low =1 , high= arr[n-1] -arr[0] ;

         while(low <= high) {
             int mid = (low + high) >> 1 ;
             if(isPossible(arr, n, cows, mid)){
                 low = mid + 1 ;
             }
             else {
                 high = mid -1 ;
             }

         }
        System.out.println("The largest minimum distance is " + high);
    }

}
