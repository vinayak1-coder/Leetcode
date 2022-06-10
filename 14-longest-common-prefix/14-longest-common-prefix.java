class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prifix = strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prifix)!=0){
                prifix=prifix.substring(0,prifix.length()-1);
            }
        }
        return prifix;
    }
}