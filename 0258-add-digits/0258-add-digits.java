class Solution {
    public int addDigits(int num) {
        if(num==0){
            return num;
        }
        int sum=0;
        int ans=0;
        while(num!=0){
           int n=num%10;
           sum=sum+n;
            num=num/10;
            ans=sum;
            
       }
        if(sum/10>=1){
            return addDigits(ans);
        }
       
        return ans;
    }
}