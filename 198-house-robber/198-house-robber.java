class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[nums.length];
        if(n==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        else if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0]=nums[0];
        dp[1]= Integer.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Integer.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}