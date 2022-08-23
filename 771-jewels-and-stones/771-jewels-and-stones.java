class Solution {
    public int numJewelsInStones(String J, String S) {
        int c=0;
        for(char j:J.toCharArray() ){
            for(char s:S.toCharArray()){
                if(s==j){
                    c++;
                }
            }
        }
        return c;
    }
}