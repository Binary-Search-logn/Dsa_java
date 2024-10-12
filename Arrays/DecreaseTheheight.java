package Arrays;

import java.util.Arrays;

public class DecreaseTheheight {
    static  int heightofthe(int arr[], int n, int k  ) {
        int max, min ;
        Arrays.sort(arr);
        int  smallest = arr[0] + k ;
        int largest = arr[n-1] - k ;
        int ans = arr[n-1]  - arr[0] ;

        for(int i =0 ; i<n-1; i++) {
            min = Math.min(smallest, arr[i+1] - k) ;
            max = Math.max(largest, arr[i] + k) ;
            ans = Math.min(ans , max-min) ;
        }
        return ans ;

    }

    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20} ;
        int n = arr.length ;
        int k = 3 ;
        System.out.println(heightofthe(arr, n, k)) ;
    }
}
