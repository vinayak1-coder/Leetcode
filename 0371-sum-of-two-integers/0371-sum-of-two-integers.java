class Solution {
    public int getSum(int a, int b) {
        int x=a^b;
        int c=a&b;
        if(c==0){
            return x;
        }
        else{
            return getSum(x,c<<1);
        }
    }
}