class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for(var i: dp) Arrays.fill(i,-1);
       return count(amount,coins,coins.length - 1,dp); 
    }
    private int count(int amount, int[] coins, int ind,int[][] dp) {
        if(amount == 0) return 1;
        if(ind < 0) return 0;
        if(dp[ind][amount] != -1) return dp[ind][amount];
        int NotTake = count(amount,coins,ind-1,dp);
        int take = 0;
        if(amount >= coins[ind]) take = count(amount - coins[ind],coins, ind,dp);
        return dp[ind][amount] = take + NotTake;
    }
}