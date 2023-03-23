class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if((arr[i]+extraCandies)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}