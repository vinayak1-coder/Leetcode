class Solution {
    public boolean isMatch(String s, String p) {
        char[] str=s.toCharArray();
        char[] pattern=p.toCharArray();
        int writeIndex=0;
        boolean isFirst=true;
        for(int i=0;i<pattern.length;i++){
            if(pattern[i]=='*'){
                if(isFirst){
                    pattern[writeIndex++]=pattern[i];
                    isFirst=false;
                }
            }else{
                pattern[writeIndex++]=pattern[i];
                isFirst=true;
            }
        }
        boolean t[][] = new boolean[str.length+1][writeIndex+1];
        if(writeIndex>0 && pattern[0]=='*'){
            t[0][1]=true;
        }
        t[0][0]=true;
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(pattern[j-1]=='?'||str[i-1]==pattern[j-1]){
                    t[i][j]=t[i-1][j-1];
                }
                else if(pattern[j-1]=='*'){
                    t[i][j]=t[i-1][j]||t[i][j-1];   
                }
            }
        }
        return t[str.length][writeIndex];
    }
}