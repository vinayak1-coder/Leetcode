class Solution {
    public int climbStairs(int n) {
        
        int [] dp = new int[n+1]; // to store subproblems
        dp[0] = 1; // for 0 step 1 way
        dp[1] = 1; // for 1 step 1 way
        for(int i = 2; i <= n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
            
        }
        return dp[n];
    }
}