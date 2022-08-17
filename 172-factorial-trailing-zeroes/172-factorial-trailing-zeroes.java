class Solution {
    public int trailingZeroes(int n) {
        int s=0;
        while(n>0){
            n/=5;
            s=s+n;
        }
       
        return s;
    }
}