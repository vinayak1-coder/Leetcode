class Solution {
    public int minDistance(String word1, String word2) {
       int l1=word1.length();
        int l2=word2.length();
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        
        int[][] dp=new int[l1+1][l2+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1[i-1]==str2[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                      dp[i][j]=1+min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
        int min(int a,int b,int c){
            int l=Math.min(a,b);
            return Math.min(l,c);
        }
}