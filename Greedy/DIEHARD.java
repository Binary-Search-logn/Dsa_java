package Greedy;

import java.util.Scanner;

public class DIEHARD {

//    Welcome to the DieHard Problem it is not running due to dp so that why i write a code in spoj
//    Go to Spoj.com check out hte solution
    static int[][] dp = new int[20][20] ;

    public static  int solve(int h , int a, int i) {
        if(h<=0 && a <=0) {
            return 0 ;
        }
        if(dp[h][a] != -1) {
            return  dp[h][a] ;
        }
        int x=0 , y=0, z=0 ;
        if(i!=1) {
            x = 1 + solve(h+3, a+2 , 1) ;
        }
        if( i != 2) {
            y = 1 + solve(h-5 , a-10, 2) ;
        }
        if( i!= 3) {
            z = 1 + solve(h-20, a+5, 3) ;
        }
        int maximum = Math.max(Math.max(x, y)  , z) ;
       return  dp[h][a] = maximum ;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int testCases = scan.nextInt()  ;
//        if  1 = +3 , +2 ;
//        if  2  = -5, -10 ;
//        if  3 = -20, +5  ;
        int health = scan.nextInt() ;
        int armor = scan.nextInt() ;


        int a = solve(health + 3, armor+ 1, 1)  ;
        int b = solve(health -5, armor-10 , 1) ;
        int c = solve(health-20, armor+5 , 1) ;
        System.out.print(Math.max(Math.max(a, b) , c))  ;
    }
}
