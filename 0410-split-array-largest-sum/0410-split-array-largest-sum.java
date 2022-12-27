class Solution {
    public int splitArray(int[] nums, int k) {
        int h = 0;
        int l = 0;
        for(int i=0;i<nums.length;i++){
            l = Math.max(l, nums[i]);
            h = h+ nums[i];
        }
        int ans=l;
        while(h>=l){
            int mid=(h+l)/2;
            int sum=0;
            int count=1;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>mid){
                    sum=nums[i];
                    count++;
                }
                else
                    sum=sum+nums[i];
            }
            if(count>k){
                l=mid+1;
            }
            else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;
    }
}