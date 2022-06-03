class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n,0,0,"",ans);
        return ans;
        
    }
    public static void solve(int n,int starting,int ending, String str, List<String> ans){
        if(starting ==n && ending ==n){
            ans.add(str);
            return;
        }
        if(starting < n){
            solve(n,starting+1,ending,str+"(",ans);
        }
        if(ending < starting){
            solve(n,starting,ending+1,str+")",ans);
        }
    }
}