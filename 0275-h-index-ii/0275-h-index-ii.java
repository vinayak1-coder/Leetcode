class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int high=citations.length-1;
        int low=0;
        int ans=0;
        while(high>=low){
            int mid=low+(high-low)/2;
            if((n-mid)<=citations[mid]){
                ans=Math.max(n-mid,ans);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}