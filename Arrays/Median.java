package Arrays;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int arr[] = {90, 100, 78, 89, 67} ;
        int n = arr.length ;

        Arrays.sort(arr) ;

            int k = n/2 ;
            System.out.print(arr[k]) ;
    }
}
