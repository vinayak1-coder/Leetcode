class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> set = new HashSet<>();
        int tempSum = 0;
        int curSum = 0;
        int cur=0;
        int prev = 0;
        while(cur < nums.length && prev < nums.length){
            if(!set.contains(nums[cur])){
                tempSum += nums[cur];
                curSum = Math.max(tempSum,curSum);
                set.add(nums[cur++]);
            }
            else {
                tempSum -= nums[prev];
                set.remove(nums[prev++]);
            }
        }
        return curSum;
    }
}