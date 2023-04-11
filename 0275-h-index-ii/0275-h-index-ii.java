class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int c=0;
        for(int i=0;i<citations.length;i++){
            if((n-i)<=citations[i]){
                c=n-i;
                break;
            }
        }
        return c;
    }
}