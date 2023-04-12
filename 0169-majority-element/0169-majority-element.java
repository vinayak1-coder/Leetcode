class Solution {
    public int majorityElement(int[] nums) {
       int ele=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            count+=nums[i]==nums[ele]?1:-1;
            if(count==0){
                ele=++i;
                count++;
            }
        }
        return nums[ele];
    }
}