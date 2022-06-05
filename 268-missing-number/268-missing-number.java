class Solution {
    public int missingNumber(int[] nums) {
         int i=0;
        while(i<nums.length){
            if(nums[i]!=i && nums[i]<nums.length){
                int temp=nums[nums[i]];
               nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return i;
    }
}