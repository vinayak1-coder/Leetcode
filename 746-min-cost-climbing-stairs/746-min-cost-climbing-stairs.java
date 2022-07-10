class Solution {
    public int minCostClimbingStairs(int[] cost) {
        var n = cost.length;
	var minCosts = new int[n + 1];

	for (var i = 2; i - 1 < n; i++)
		minCosts[i] = Math.min(minCosts[i - 1] + cost[i - 1], 
							   minCosts[i - 2] + cost[i - 2]);
	return minCosts[n];
        
    }
}