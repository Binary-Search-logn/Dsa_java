package SearchingAndSorting;

public class pivotInArray {
    static int pivot(int arr[], int n) {
        if(arr == null || n==0) {
            return -1 ;
        }
        if(arr[0] <= arr[n-1] ) {
            return 0 ;
        }
        int start = 0 ;
        int end = n-1 ;
        while(start<= end) {
             int mid = (start + end) /2 ;
            if(arr[mid]> arr[mid+1]) {
                return (mid +1 ) ;
            }
            else if(arr[start] <= arr[mid]) {
                start = mid +1 ;
            }
            else {
                end = mid -1  ;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6,7} ;
        int n = arr.length ;
      int z=   pivot(arr, n) ;
        System.out.println(z) ;
    }
}
