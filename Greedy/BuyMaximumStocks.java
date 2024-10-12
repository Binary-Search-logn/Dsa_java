package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class BuyMaximumStocks {
// This Code is not run because it is written in C++
    static class Pair {
        int first, second ;
        Pair(int first, int second) {
            this.first = first ;
            this.second = second ;
        }
    }
    static class  SortPair  implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            return a.first = b.first ;
        }
    }

    static int buyMaximumProducts(int [] price , int k , int n  ) {
        Pair [] arr = new Pair[n] ;

        for(int i=0 ; i<n ;i++) {
            arr[i] = new Pair(price[i] , i+1 ) ;
        }
        Arrays.sort(arr, new SortPair() );
        int ans =0 ;
        for(int i=1 ; i<n ;i++) {
            int prices = arr[i].first ;
             int stock = arr[i].second ;

             if(prices* stock <=k ) {
                 ans += stock ;
                 k -= (prices *stock) ;
             }
             else {
                 ans += (k/prices) ;
                 k -= prices & (k/prices) ;
             }
        }
        return ans ;
    }

    public static void main(String[] args) {
        int [] price = {10, 7, 19} ;
        int k = 45 ;
        System.out.println(buyMaximumProducts(price, k , price.length)) ;
    }
}
