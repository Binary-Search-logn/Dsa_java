package Strings;

public class editDistance {

    public static int editDistDP(String a , String b ) {
        int m = a.length();
        int n = b.length();
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; i++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
                }
            }
        }
        return dp[m][n] ;
    }
    public static void main(String[] args) {
        String str1 = "horse";
        String str2 = "ros";
        int n = str1.length();
        int m = str2.length();
        int z = editDistDP(str1, str2 ) ;
        System.out.println(z);
    }
}
