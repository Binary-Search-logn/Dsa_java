package Arrays;

public class MinimumSubArray {
    public static int smallestSubArrayWithSum(int arr[], int n , int x ) {
       int sum =0 ;
       int minLength = n+1 ;
       int start =0 ;
       int end =0 ;


       while(end<n) {
           while(sum<=x&& end<n) {
               sum += arr[end++] ;
           }
           while(sum>x && start<n) {
               if(end-start < minLength) {
                   minLength = end-start ;
               }
               sum -= arr[start++] ;

           }
       }
       return minLength ;

    }
    public static int small(int arr[], int n , int x ) {
        int sum =0 ;
        int minlength = n+1 ;
        int start = 0 ;
        int end = 0 ;

        while(end <n) {
            while(sum <=x && end<n) {
                sum += arr[end++] ;
            }
            while(sum >x && start<n) {
                if(end-start <minlength) {
                    minlength = end-start ;
                }
                sum -= arr[start++]  ;
            }
        }
        return minlength ;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 19} ;
        int n = arr.length ;
        int x = 51 ;
        System.out.println(smallestSubArrayWithSum(arr, n, x));
        System.out.println();
        System.out.println(small(arr, n, x ));
    }
}
