class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //int[] arr=new int[k];
        long sum=0; 
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        long max=sum;
        for(int i=k;i<nums.length;i++){
            sum += nums[i]-nums[i-k];
            max = Math.max(sum,max);
        }
       return (max/1.0/k);
    }
}