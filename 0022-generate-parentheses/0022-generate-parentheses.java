class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        start(n,0,0,"",ans);
        return ans;
    }
    public static void start(int n,int starting,int ending,String str,List<String> ans ){
        if(starting==n && ending==n){
            ans.add(str);
            return;
        }
        if(starting<n){
            start(n,starting+1,ending,str+"(",ans);
        }
        if(ending<starting){
            start(n,starting,ending+1,str+")",ans);
        }
    }
}