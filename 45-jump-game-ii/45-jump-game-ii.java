class Solution {
    public int jump(int[] nums) {
       int i,n,j;
        n=nums.length;
        int [] pre = new int[n];
        for(i=0;i<n;i++)
        {
            pre[i] = Integer.MAX_VALUE;
        }
        pre[0] = 0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<=i+nums[i] && j<n;j++)
            {
                pre[j] = Math.min(pre[j], pre[i]+1);
            }
        }
        return pre[n-1]; 
    }
}