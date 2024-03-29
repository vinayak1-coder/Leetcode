class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0;i<capacity.length;i++){
            capacity[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]==0){
                count++;
            }
            else if(capacity[i] <= additionalRocks){
                count++;
                additionalRocks=additionalRocks-capacity[i];
            }
            else{
                break;
            }
        }
        return count;
    }
}