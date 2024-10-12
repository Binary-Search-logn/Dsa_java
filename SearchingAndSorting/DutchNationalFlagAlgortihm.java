package SearchingAndSorting;

public class DutchNationalFlagAlgortihm {
    static void swap(int [] arr, int i, int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j]  = temp  ;
    }
    static void DNS(int [] arr, int n) {
        int low =0  ;
        int high = n-1 ;
         int mid = 0 ;
         while(mid <= high) {
             if(arr[mid] ==0 ) {
                swap(arr, low, mid) ;
                low ++ ;
                mid ++ ;
             }
             else if( arr[mid] == 1 ){
                 mid++ ;
             }
             else {
                 swap(arr,mid, high) ;
                 high-- ;
             }
         }
    }

    static void print(int [] arr, int n ) {
        for(int i=0 ; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {1,1, 2, 0, 0, 1, 2, 2, 1, 0} ;
        int n = arr.length ;
        DNS(arr , n) ;
         print(arr, n) ;
    }
}
