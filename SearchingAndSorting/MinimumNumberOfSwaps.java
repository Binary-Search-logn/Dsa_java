package SearchingAndSorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MinimumNumberOfSwaps {
     public static int minSwaps(int[] arr) {
         int n = arr.length ;
         int ans =0 ;
         int [] temp = Arrays.copyOfRange(arr, 0, n)  ;
           Arrays.sort(temp) ;
           for(int i=0 ;i<n; i++) {
               if(arr[i] != temp[i]) {
                   ans ++ ;
                   swap(arr, i, indexOf(arr, temp[i])) ;
               }
           }
           return ans ;
     }

     static int indexOf(int arr[], int ele) {
         for(int i=0 ; i<arr.length ; i++) {
             if(arr[i] == ele) {
                 return i ;
             }
         }
           return  -1 ;
     }

     static void  swap(int arr[], int i, int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
     }

    public static void main(String[] args) {
        int[] a
                = { 101, 758, 315, 730, 472,
                619, 460, 479 };

        System.out.println(minSwaps(a) );
    }
}
