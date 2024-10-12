package SearchingAndSorting;

public class PainterPartitionProblem {

    static int FindPainters(int arr[], int n , int m, int mid) {
         int sum =0 ; int painters =1 ;
         for(int i=0 ; i<n; i++) {
             sum += arr[i] ;
             if(sum  > mid) {
                 painters ++ ;
                 sum = arr[i] ;
             }
         }
         return  painters ;
    }
    static int painterPartition(int arr[], int n , int m) {
        int low = arr[0] ;
        int high = 0 ;
        if(n<m) {
            return  -1 ;
        }
        for (int i=0 ;i<n; i++) {
            low = Math.min(low , arr[i]) ;
            high += arr[i] ; // To store the maximum of the array
        }
        while (low<= high) {
            int mid = (low + high) >>1 ;
            int painters = FindPainters(arr, n, m, mid) ;
            if(painters <= m) {
               high =mid -1 ;
            }
            else  {
                low = mid +1  ;
            }
        }
        return low ;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40} ;
        int n = arr.length ;
        int m = 2 ;
        int x = painterPartition (arr, n, m) ;
        System.out.println(x) ;

    }

}
