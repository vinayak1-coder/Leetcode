class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        LinkedList<Integer> comb =new LinkedList<Integer>();
        this.bt(target,comb,0,candidates,res);
        return res;
    }
    protected void bt(int remain,LinkedList<Integer> comb,int start , int[] candidates,List<List<Integer>> res){
        if(remain==0){
            res.add(new ArrayList<Integer>(comb));
            return;
        }
        else if(remain<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            comb.add(candidates[i]);
            this.bt(remain-candidates[i],comb,i,candidates,res);
            comb.removeLast();
        }
    }
}