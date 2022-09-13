class Solution {
    public int jump(int[] nums) {
       int i,n,j;
        n=nums.length;
        int [] pre = new int[n];
        for(i=0;i<n;i++)
        {
            pre[i] = Integer.MAX_VALUE;
        }
        pre[n-1] = 0;
        for(i=n-2;i>=0;i--)
        {
            int min=Integer.MAX_VALUE;
            for(j=i+1;j<=Math.min(n-1,i+nums[i]);j++)
            {
                min = Math.min(min, pre[j]);
            }
            if(min!=Integer.MAX_VALUE){
                pre[i]=min+1;
            }
        }
        return pre[0]; 
    }
}