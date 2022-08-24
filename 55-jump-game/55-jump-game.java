class Solution {
    public boolean canJump(int[] nums) {
        int jump=0;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1 && jump>=i;i++){
            if(jump<i+nums[i]){
                jump = i + nums[i];
            }
            if(jump >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}