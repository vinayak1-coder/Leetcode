class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int a=0;
        int sum=0;
        if(costs[0]>coins){
            a=0;
        }
        else{
        for(int i=0;i<costs.length;i++){
             if(costs[i] <= coins){
                coins = coins - costs[i];
                a++;
            }
            else{
                break;
            }
        }
        
    }
        return a;
}
}