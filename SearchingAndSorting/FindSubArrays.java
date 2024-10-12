package SearchingAndSorting;

import java.util.HashSet;
import java.util.Set;

public class FindSubArrays {
    static boolean subarray(int arr[], int n) {

        Set<Integer> hs = new HashSet<>() ;
        int sum =0 ;
        for(int i=0 ;i<n; i++) {
            sum += arr[i] ;
            if(arr[i] ==0  || sum ==0 || hs.contains(sum))  {
               return true ;
            }
            hs.add(sum) ;
        }
        return false ;

    }
    public static void main(String[] args) {
        int arr[]  = { -3, 2, 3, 1, 6 } ;
        int n = arr.length ;
       boolean z=  subarray(arr, n) ;
        System.out.println(z);
    }
}
