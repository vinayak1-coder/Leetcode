class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        if(nums==null || nums.length==0){
            return list;
        }
        List<List<Integer>> dp=new ArrayList<>();
        for(int num:nums) dp.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            List<Integer> max=new ArrayList<>();
            for(int k=0;k<i;k++){
                if(nums[i]%nums[k]==0 && max.size()<dp.get(k).size()){
                    max=dp.get(k);
                }
            }
            dp.get(i).addAll(max);
            dp.get(i).add(nums[i]);
        }
        for(int i=0;i<dp.size();i++){
            if(list.size()<dp.get(i).size()){
                list=dp.get(i);
            }
        }
        return list;
    }
}