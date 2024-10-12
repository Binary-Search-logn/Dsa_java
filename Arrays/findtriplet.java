package Arrays;

import java.util.Arrays;

public class findtriplet {
//   Time complexity of this algorithm is O(N)^3 ;
    public static boolean triplet(int arr[], int sum, int n) {
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<arr.length;j++) {
                for(int k=2;k<arr.length;k++) {
                    if(arr[i] +arr[j] + arr[k] == sum) {
                        System.out.println("Triplet is " + arr[i]+ " "+ arr[j] + " " + arr[k] ) ;
                        return true ;
                    }
                }
            }
        }
        return false ;
    }
//    Optimized solution
    public static boolean tripetoptimize(int arr[], int sum, int n) {
        Arrays.sort(arr);

       int l , r ;
       for(int i=0; i<arr.length-2; i++) {
           l = i+1 ;
           r = arr.length-1 ;
           while(l<r) {
               if(arr[i] + arr[l] + arr[r] == sum ){
                   System.out.println(arr[i]+ " " +   arr[l] + " " +  arr[r]);
                   return true  ;
               }
               else if ( arr[i]+ arr[l]+  arr[r] <sum) {
                   l++ ;
               }
               else {
                   r-- ;
               }
           }
       }
       return false ;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8} ;
        int sum = 22;
        int n = arr.length ;

        triplet(arr, sum, n) ;
        System.out.println();
        tripetoptimize(arr, sum, n) ;
    }
}
