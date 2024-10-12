package Arrays;

import java.util.Arrays;

public class NdivK {
    public static void Ndvik(int arr[], int N, int k) {
        Arrays.sort(arr);
        for(int i=0;i<N;i++) {
            int cnt = 1 ;
            while((i+1)<N && arr[i] ==arr[i+1] ) {
                cnt++ ;
                i++ ;
            }
            if(cnt >(N/k) ){
                System.out.println(arr[i] + " " ) ;
            }
            i++ ;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 6, 6, 6, 7, 10} ;
        int N = arr.length ;
        int k =4 ;
        Ndvik(arr, N, k) ;
    }
}
