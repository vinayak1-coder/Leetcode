class Solution {
    public int splitArray(int[] nums, int k) {
        //first we will find the min and max ans that we can get from the given arrray our ans must lie betweem this range only
        int h = 0;
        int l = 0;
        for(int i=0;i<nums.length;i++){
            l = Math.max(l, nums[i]);
            h = h+ nums[i];
        }
        //now declear the answer as the lowest possible value
        int ans=l;
        //apply simple binary search
        while(h>=l){
            int mid=(h+l)/2;
            int sum=0;
            int count=1;
            // the loop will give us the maximum number of the sub array that can be given which has the sum equal to the mid value
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>mid){
                    sum=nums[i];
                    count++;
                }
                else
                    sum=sum+nums[i];
            }
            //now if the no. of sub array in the which has sum equal to mid are greater the k then we change our low value other wise we change the high and ans euual to that mid value
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