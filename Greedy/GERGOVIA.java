package Greedy;

import java.util.ArrayList;
import java.util.Scanner;

class Pair {
    int first, second ;
    Pair(int first, int second) {
        this.first = first ;
        this.second = second ;
    }
}
public class GERGOVIA {



    public static int  BuyAndSellWines(int n , int[] temp){
        Pair[] Buy = new Pair[n] ;
        Pair[] Sell = new Pair[n] ;

        for(int i=0 ;i<n ;i++) {
            if(temp[i] >0) {
                Buy[i] = new Pair(temp[i], i) ;
            }
            else {
                Sell[i] = new Pair(temp[i], i) ;
            }
        }
        int ans =0 ;
        int i =0 , j=0 ;
        while(i< Buy.length && j<Sell.length) {
            int x = Math.min(Buy[i].first , -Sell[i].first) ;
            Buy[i].first -= x ;
            Sell[i].first += x ;
            int diff = Math.abs(Buy[i].second - Sell[i].second) ;
            ans += (x *diff)  ;
            if(Buy[i].first ==0 ) {
                i++ ;
            }
            if(Sell[i].first == 0) {
                j++ ;
            }
        }

        return ans ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int numberOfWines = scan.nextInt() ;
        int arr[] = new int[numberOfWines] ;
        for(int i=0 ;i<numberOfWines ;i++) {
            arr[i] = scan.nextInt() ;
        }
        int num = BuyAndSellWines(numberOfWines, arr) ;
        System.out.println(num);
    }
}
