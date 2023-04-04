class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        if(nums.length<1){
            return ans;
        }
        per(nums,ans,list,new boolean[nums.length]);
        return ans;
    }
    private void per(int[] nums,List<List<Integer>> ans,List<Integer> list,boolean[] visited){
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
         for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;
            list.add(nums[i]);
            visited[i] = true;
            per(nums,ans,list,visited);
            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }
}