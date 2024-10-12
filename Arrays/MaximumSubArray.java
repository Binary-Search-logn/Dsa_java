package Arrays;

public class MaximumSubArray {

//    Kadane's Algorithm
    public static int maxSumArray(int arr[]) {
        int n = arr.length ;
        int curr = 0 ;
        int max = 0 ;
        for(int i=0; i<n; i++) {
            curr += arr[i] ;
            if(curr>max) {
                max = curr ;
            }
            if(curr<0) {
                curr = 0 ;
            }
        }
        return  max ;
    }

    public static int kadane(int arr[] ) {
        int n = arr.length ;
        int curr = 0;
        int max = 0 ;
        for(int  i =0; i<n ; i++) {
            curr = curr + arr[i] ;
           if(curr>max) {
               max = curr ;
           }
           if(curr<0) {
               curr = 0 ;
           }
        }
        return max ;
    }


public static void main(String[] args) {
    int arr[] = {-2, -3,  4, -1, -2, -1, -5, -3 } ;
    System.out.println(kadane(arr));

}
}

