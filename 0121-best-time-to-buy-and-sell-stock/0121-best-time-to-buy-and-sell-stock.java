class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int[] arr = new int[prices.length];
        int[] arr2 = new int[prices.length];
        //int[] pr = new int[prices.length];
        arr[0]=prices[0];
        arr2[prices.length-1]= prices[prices.length-1];
        for(int i=1;i<prices.length;i++){
           arr[i]=Math.min(arr[i-1],prices[i]);
        }
        for(int i=prices.length-2;i>=0;i--){
            arr2[i] = Math.max(arr[i+1],prices[i]);
        }
        for(int i=0;i<prices.length;i++){
            max=Math.max(max, arr2[i]-arr[i]);
        }
        return max;
    }
}