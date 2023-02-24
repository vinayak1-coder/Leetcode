class Solution {
    public int findTargetSumWays(int[] nums, int s) {
        return  find(nums.length-1, s, nums);
    }
    static int find(int n, int s, int ar[]){
        
        if( n == -1 && s == 0)   return 1;

        if( n <= -1 )   return 0;
    
        return find(n-1, s-ar[n], ar) + find(n-1, s+ar[n], ar);
    }
}