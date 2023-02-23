class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> lt=new ArrayList<>();
        gen(n,0,0,"",lt);
        return lt;
        
    }
        public static void gen(int n,int start,int end,String st,List<String> lt){
            if(start==n && end==n){
                lt.add(st);
                return;
            }
            if(start<n){
                gen(n,start+1,end,st+"(",lt);
            }
            if(end<start){
                gen(n,start,end+1,st+")",lt);
            }
                             
        }
}