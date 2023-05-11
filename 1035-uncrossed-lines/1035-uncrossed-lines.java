class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        // int count=0;
        // int c=0;
        // for(int i=0;i<nums1.length;i++){
        //     int temp=nums1[i];
        //     for(int j=c;j<nums2.length;j++){
        //         if(temp==nums2[j]){
        //             c=j;
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return count;
        int[][] dp=new int[nums1.length+1][nums2.length+1];
        //dp[0][0]=0;
        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<=nums2.length;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[nums1.length][nums2.length];
    }
}