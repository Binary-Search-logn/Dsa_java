package Arrays;

public class MinimumSwaps {
    public static int minSwap(int arr[],int n, int k) {
        int good = 0 ;
        int bad = 0 ;
        for(int i=0;i<n; i++) {
            if(arr[i]<=k) {
                good ++ ;
            }
        }
        for(int i=0; i<good; i++ ) {
            if(arr[i] > k) {
                bad++ ;
            }
        }

        int i=0 , j = good , ans = bad ;
        while(j<n) {
            if(arr[i]>k) {
                bad -- ;
            }
            if(arr[j] > k) {
                bad ++ ;
            }
            ans = Math.min(ans, bad) ;
            i++ ;
            j++ ;
        }
        return  ans ;
    }

    public static int minswap2(int arr[], int n, int k) {
        int good = 0 ;
        int bad =0 ;
        for(int i=0;i<n; i++) {
            if(arr[i]<=k) {
                good ++ ;
            }
        }
        for(int i=0; i<good ; i++) {
            if( arr[i]>k) {
                bad ++ ;
            }
        }
        int i=0 , j = good , ans = bad ;
        while(j<n) {
            if(arr[i] >k) {
                bad -- ;
            }
            if(arr[j] >k) {
                bad ++ ;
            }
            ans = Math.min(ans, bad) ;
            i++ ; j++ ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 7} ;
        int n =arr.length ;
        int k = 3 ;
        System.out.println(minSwap(arr, n, k));
    }
}
