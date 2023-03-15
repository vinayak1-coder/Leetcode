class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int high=0;
        int low=0;
        int sum=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
            sum=0-nums[i];
            high=nums.length-1;
            low=i+1;
            }
            while(high>low){
                if(nums[high]+nums[low]+nums[i]==0){
                    list.add(Arrays.asList(nums[i],nums[high],nums[low]));
                
                while(high>low &&nums[low]==nums[low+1]){
                    low++;
                }
                while(high > low && nums[high]==nums[high-1]){
                    high--;
                }
                low++; high--;
                }
               else if(nums[low]+nums[high]+nums[i]>0){
                    high--;
                }
                else{
                    low++;
                }
               
            }
        }
        return list;
    }
}