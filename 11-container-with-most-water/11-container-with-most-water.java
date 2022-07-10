class Solution {
    public int maxArea(int[] height) {
         int len = height.length;
        int low = 0 , high = len-1 ;
        int maxCap = 0;
        while(low<high){
            int cap = (high - low  )* Math.min(height[low], height[high]);
            if(maxCap<cap) maxCap = cap;
            if( height[low] > height[high] ){
                high--;
            }
            else{
                low++;
            }
            
            
        }
        return maxCap; 
    }
}