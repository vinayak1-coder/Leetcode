class Solution {
    public int minimumRounds(int[] tasks) {
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i: tasks) {
            map.put(i,map.getOrDefault(i,0) + 1);
        
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                return -1;
            }
            else{
                count+=map.get(i)/3;
                if(map.get(i)%3!=0){
                    count++;
                }
            }
        }
        return count;

    }
}