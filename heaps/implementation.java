package heaps;

public class implementation {
    public static void heapify(int arr[], int n, int i ) {
        int largest = i ;
        int l = 2*i+1 ;
        int r = 2*i+2 ;
        if (l<n && arr[l] >arr[largest]) {
            largest = l ;
        }
        if(r<n && arr[r] >arr[largest] ){
            largest = r ;
        }
       if(largest != i) {
           int temp = arr[i] ;
           arr[i] = arr[largest] ;
           arr[largest] = temp ;
           heapify(arr, n, largest) ;
       }
    }
    public static  void heapsort(int arr [], int N ) {
         buildHeap(arr, N) ;
         for(int i=N-1 ; i>0; i--) {
             int temp = arr[0] ;
             arr[0] = arr[i] ;
             arr[i] = temp ;
             heapify(arr, i , 0) ;
         }
    }

    static void buildHeap(int arr[] , int N ) {
        int startIdx = (N/2)-1 ;
        for(int i= startIdx ; i>=0 ; i--) {
            heapify(arr, N, i) ;
        }
    }
   static void print(int arr[] , int N ) {
        for(int i=0 ;i<N ;i++) {
            System.out.print(arr[i] + " ");
        }
       System.out.println();
   }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int N = arr.length;
        buildHeap(arr, N) ;
        print(arr, N) ;
        heapsort(arr, N) ;
        print(arr, N) ;

    }

}
