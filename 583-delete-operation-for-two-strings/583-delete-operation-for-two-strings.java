class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1+1][len2+1];
        for (int row=1; row<=len1; row++) {
            for (int col=1; col<=len2; col++) {
                dp[row][col] = word1.charAt(row-1) == word2.charAt(col-1)
                        ? dp[row][col] = dp[row-1][col-1] + 1
                        : Math.max(dp[row-1][col], dp[row][col-1]);
            }
        }
        int maxSubseq = dp[len1][len2];
        return word1.length() + word2.length() - 2 * maxSubseq;
    }
}