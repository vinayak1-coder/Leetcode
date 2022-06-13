class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
         int[][]dp = new int[triangle.size()][triangle.size()];
    for (int i = 0; i < triangle.size(); i++){
        dp[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
    }

    for (int row = triangle.size()-2; row >= 0; row--){
        for (int pos = 0; pos < triangle.get(row).size(); pos++){
            dp[row][pos] = triangle.get(row).get(pos) + Math.min(dp[row+1][pos+1], dp[row+1][pos]);
        }
    }

    return dp[0][0];
    }
}