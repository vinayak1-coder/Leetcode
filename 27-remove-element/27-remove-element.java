class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int[] arr = new int[nums.length];
        int s=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                arr[j++]=nums[i];
                s=s+1;
            }
        }
        for(int i=0;i<s;i++){
            nums[i]=arr[i];
        }
        return s;
    }
}