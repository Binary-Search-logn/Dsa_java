package SearchingAndSorting;

import java.util.Arrays;

public class PlaceEllementsToMaximizeMInimumDistance {
    static boolean isFeasible(int mid, int arr[], int n, int k) {
        int pos = arr[0] , elements = 1 ;
        for(int i=1 ; i<n; i++) {
            if(arr[i] -pos >= mid) {
                pos = arr[i] ;
                elements ++ ;
                if(elements  == k) {
                    return true ;
                }
            }
        }
        return false ;
    }
    static int largestMinimumDistance(int arr[], int n, int k) {
//     BinarySearchOperation
        Arrays.sort(arr);
        int left = 1;
        int right = arr[n - 1];
        int result = -1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (isFeasible(mid, arr, n, k)) {
                result = Math.max(result, mid);
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 9};
        int n = 5;
        int k = 3;
        System.out.print("largest min distance is : " +
                largestMinimumDistance(arr, n, k));
    }
}
