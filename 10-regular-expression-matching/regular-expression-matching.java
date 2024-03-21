class Solution {
    public boolean isMatch(String text, String pattern) {
        int m = text.length();
        int n = pattern.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j > 1 && pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (i > 0 && (text.charAt(i - 1) == pattern.charAt(j - 2) ||
                            pattern.charAt(j - 2) == '.') && dp[i - 1][j]);
                } else {
                    dp[i][j] = i > 0 && dp[i - 1][j - 1] && (text.charAt(i - 1) == pattern.charAt(j - 1) ||
                            pattern.charAt(j - 1) == '.');
                }
            }
        }

        return dp[m][n];
    }
}