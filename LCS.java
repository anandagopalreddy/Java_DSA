public class LCS {
    static int lcs(String X, String Y) {
        int m = X.length(), n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                dp[i][j] = X.charAt(i - 1) == Y.charAt(j - 1) ? 1 + dp[i - 1][j - 1] : Math.max(dp[i - 1][j], dp[i][j - 1]);
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB", s2 = "GXTXAYB";
        System.out.println(lcs(s1, s2));
    }
}
