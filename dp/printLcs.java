package dp;

public class printLcs {

    public static void  lcs(String s, String t) {
        int n = s.length() ;
        int m = t.length() ;
        int dp[][] = new int[n+1][m+1] ;
        for(int i =0 ;i<=n ;i++) {
            for(int j=0 ;j<=m ;j++) {
                dp[i][j] = -1 ;
            }
        }
        for(int j=0 ;j<=m ;j++) {
            dp[0][j] =0 ;
        }
        for(int i=0 ;i<=n ;i++) {
            dp[i][0]  =0 ;
        }
        for(int i=1 ; i<=n ;i++) {
            for(int j=1 ;j<=m ;j++) {
                if(s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1] ;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) ;
                }
            }
        }
        int len = dp[n][m] ;
        int index = len ;

        char[] lcs = new char[index+1] ;
        lcs[index]
                = '\u0000';
        int i = n ;
        int j = m ;

        while(i>0 && j>0) {
            if(s.charAt(i-1) == t.charAt(j-1)) {
                lcs[index-1] = s.charAt(i-1) ;
                i--  ;
                j-- ;
                index-- ;
            }
            else if(dp[i-1][j] > dp[i][j-1]) {
                i-- ;
            }
            else {
                j-- ;
            }
        }
        for(int k=0 ;k< len ;k++) {
            System.out.print(lcs[k]) ;
        }

    }

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        lcs(X, Y);
    }
}
