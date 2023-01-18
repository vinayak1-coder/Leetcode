class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = nums[0], maxSum = nums[0];
        int curMin = nums[0], minSum = nums[0];
        int sum = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            curMax = Math.max(nums[i], curMax + nums[i]);
            maxSum = Math.max(maxSum, curMax);
            
            curMin = Math.min(nums[i], curMin + nums[i]);
            minSum = Math.min(minSum, curMin);
            sum += nums[i];
        }
        return sum == minSum ? maxSum : Math.max(maxSum, sum - minSum);
    }
}