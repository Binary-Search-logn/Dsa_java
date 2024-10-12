package Arrays;

public class MaxElement {

//    To Find the Maximum Elemnt in the array
    public static int Max(int arr[], int n ) {
        int res = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            res = Math.max(res, arr[i]) ;
        }
        return res ;
    }
    public static int Min(int arr[], int n ) {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            result = Math.min(result, arr[i]) ;
        }
        return result ;
    }
    public static void main(String[] args) {
        int arr[] = {4,5, 3, 6, 7, 8, 9} ;
        int n = arr.length ;
        System.out.println(Max(arr, n));
        System.out.println(Min(arr, n));
    }
}
