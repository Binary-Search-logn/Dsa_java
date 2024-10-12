package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArray {
    public static boolean subArray(int arr[], int n) {
        Set<Integer> set = new HashSet<>() ;
        int sum =0 ;
        boolean found = false ;
        for(int element : arr) {
            set.add(sum) ;
            sum+= element ;
            if(sum == 0 ||set.contains(sum)){
                found = true ;
                break;
            }
        }
        return  found ;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,-3, 1, 6} ;
        int n = arr.length ;
        System.out.println(subArray(arr, n) );
    }
}
