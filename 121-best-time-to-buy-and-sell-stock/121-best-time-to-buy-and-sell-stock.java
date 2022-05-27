class Solution {
   public int maxProfit(int[] nums) {
   if(nums.length==1) return 0;
   int maxProfit=0;
   int min=Integer.MAX_VALUE;
   for(int i=0;i<nums.length;i++){
        if(min>nums[i]){
                min=nums[i];
        }
           else if(nums[i]-min>maxProfit) {
              maxProfit=nums[i]-min;
      }
   }
        return maxProfit;
}
}