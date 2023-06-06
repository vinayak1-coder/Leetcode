class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=2){
            return true;
        }
        for(int i=1;i<arr.length-1;i++){
            int c=arr[i]-arr[i-1];
            int d=arr[i+1]-arr[i];
            if(c!=d){
                return false;
                //break;
            }
        }
        return true;
    }
}