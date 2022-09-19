class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int c=1;
        int[] dp= new int[nums.length];
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    max=Math.max(max,dp[j]);
                }
                dp[i]=max+1;
                c=Math.max(c,dp[i]);
            }
        }
        return c;
    }
}