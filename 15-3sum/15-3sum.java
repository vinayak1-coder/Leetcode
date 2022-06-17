class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int low=i+1;
                int high=nums.length-1;
                int sum=0-nums[i];
                while(high>low){
                    if(nums[high]+nums[low]==sum){
                        result.add(Arrays.asList(nums[i],nums[high],nums[low]));
                        while(high>low && nums[low]==nums[low+1])low++;
                        while(high>low && nums[high]==nums[high-1])high--;
                        high--;
                        low++;
                    }
                    else if(nums[high]+nums[low]>sum)
                        high--;
                    else
                        low++;
                }
            }    
        }
        return result;
    }
}