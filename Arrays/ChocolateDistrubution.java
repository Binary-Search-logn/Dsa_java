package Arrays;

import java.util.Arrays;

public class ChocolateDistrubution {


    static int findMinDiff(int arr[], int n,
                           int m)
    {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

        // Sort the given packets
        Arrays.sort(arr);

        // Number of students cannot be
        // more than number of packets
        if (n < m)
            return -1;

        // Largest number of chocolates
        int ans = Integer.MAX_VALUE;

        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.

        for (int i = 0; i<n-m; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < ans)
                ans = diff;
        }
        return ans;
    }

    public static int chocolate(int arr[], int n, int m) {

        int ans = Integer.MAX_VALUE;
        if(m==0 || n==0 ) {
            return 0 ;
        }
          Arrays.sort(arr);
        for(int i=0; i<n-m ;i++) {
            int diff = arr[i+m-1] -arr[i] ;
            if(diff<ans ) {
                ans = diff ;
            }

        }
        return ans ;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = {3, 4, 1, 9, 56, 7, 9 ,12} ;

        int m = 5;  // Number of students

        int n = 8;
        System.out.println("Minimum difference is "
                + chocolate(arr, n, m));

    }
}
