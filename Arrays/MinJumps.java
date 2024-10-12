package Arrays;

public class MinJumps {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 1, 0, 9 };
        int n  = arr.length  ;
        System.out.println(min(arr,n));
    }
    public static int min(int arr[], int n) {
        if(arr[0] ==0 ) {
            System.out.println("Array is Empty ") ;
        }
        int jumps [] = new int[n+1] ;
        jumps[0] = 0 ;
        for(int i =1; i<n; i++) {
            jumps[i] = Integer.MAX_VALUE ;
            for(int j=0; j<i; j++) {
                if(i<= j+arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] +1) ;
                }
            }
        }
        return jumps[n-1] ;
    }
}
