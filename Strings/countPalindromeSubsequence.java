package Strings;

public class countPalindromeSubsequence {
    static int helper(String s, int dp[][], int i, int j){
        if(i>j) {
            return 0 ;
        }
        if(i==j) {
            return 1 ;
        }
       if(s.charAt(i) == s.charAt(j)) {
           dp[i][j] = helper(s, dp, i+1, j) + helper(s, dp, i, j-1) ;
       }
       else {
           dp[i][j] = helper(s, dp, i, j-1 ) + helper(s , dp, i+1, j) - helper(s, dp, i+1, j-1) ;
       }
       return dp[i][j] ;
    }
    public static void main(String[] args) {
        String str = "abcd" ;
        int n = str.length() ;
        int dp[][]  = new int[101][101] ;
        for(int i=0  ; i<n; i++) {
            for(int j=0 ;j<n; j++) {
                dp[i][j] = -1 ;
            }
        }
       int Z=  helper(str, dp, 0, n-1) ;
        System.out.println(Z) ;
    }
}
