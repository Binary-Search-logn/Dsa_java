package SearchingAndSorting;

import java.util.Arrays;

public class RepeatAndMissing {
    static int[] repeat(int arr[], int n) {
        int  a = 0 ;
        int b =0 ;
        for(int i=0 ; i<n ; i++) {
            int abs_value = Math.abs(arr[i]) ;
            if(arr[abs_value-1] <0) {
                a = abs_value ;
            }
            else {
                arr[abs_value-1] = -arr[abs_value-1] ;
            }
        }
        for(int i=0 ; i<n ; i++) {
            if(arr[i]>0) {
                b = i+1 ;
            }
        }
        int nums[] = new int[2] ;
        nums[0] = a ;
        nums[1]  = b ;
         return nums ;
    }
    public static void main(String[] args) {
        int  arr[] = {2, 4, 1, 2, 5} ;
        int n = arr.length ;
        System.out.println(Arrays.toString(repeat(arr, n)));
    }
}
