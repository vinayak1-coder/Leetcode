class Solution {
    public int arrangeCoins(int n) {
        int count=1;
        // if(n==1){
        //     return 1;
        // }
        while(n>0){
            count++;
            n=n-count;
        }
        return count-1;
        
    }
}