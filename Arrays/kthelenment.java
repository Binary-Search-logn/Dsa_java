package Arrays;

import java.util.Arrays;

public class kthelenment {

    public static  int findkthterm(int arr[], int n, int k) {

        Arrays.sort(arr);
        return arr[k-1] ;
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 20, 15} ;
        int n = arr.length ;
        int k = 4 ;
        System.out.println(findkthterm(arr, n, k));
    }
}
