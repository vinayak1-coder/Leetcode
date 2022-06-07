class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        sub(arr,0,curr,ans);
        return ans;
    }
    public void sub(int[] arr,int i , List<Integer> curr, List<List<Integer>> ans){
        if(i== arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        sub(arr,i+1,curr,ans);
        curr.remove(curr.size()-1);
        sub(arr,i+1,curr,ans);
        
    }
}