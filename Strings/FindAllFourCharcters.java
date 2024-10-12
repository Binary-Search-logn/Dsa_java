package Strings;

import java.util.HashMap;

public class FindAllFourCharcters {
   public static class  pair{
        int first , second ;
        public pair(int first, int second) {
            this.first = first ;
            this.second = second ;
        }
    }
    static void findfourelements(int arr[], int n , int x) {

        HashMap<Integer, pair> map = new HashMap<Integer, pair>( );
        for(int i=0 ; i<n-1 ; i++) {
            for(int j=i+1 ; j<n; j++) {
               map.put (arr[i] + arr[j],  new pair(i, j)) ;
            }
        }
//        Transverse the HashMap
       for(int i=0 ; i<n-1  ; i++) {
           for(int j=0 ;j<n ; j++) {
               int sum = arr[i] + arr[j] ;
               if(map.containsKey(x-sum) ) {
                   pair  p = map.get(x-sum) ;
                   if(p.first !=i && p.first != j && p.second != i && p.second != j){
                       System.out.println(arr[i] + ", " + arr[j] + ", " + arr[p.first] + " , " + arr[p.second] );
                    return ;
                   }
               }
           }
       }
    }
    public static void main(String[] args) {
        int arr[]  = {10, 20, 30, 40, 1, 2} ;
        int  n = arr.length ;
        int x = 91 ;
        findfourelements(arr, n, x) ;
    }
}
