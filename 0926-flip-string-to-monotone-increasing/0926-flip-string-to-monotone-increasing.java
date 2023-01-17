class Solution {
    public int minFlipsMonoIncr(String s) {
        int oneooc=0;
        int flip=0;
        for(char ch : s.toCharArray()){
            if(ch=='1'){
                oneooc++;
            }
            else{
                flip = Math.min(flip+1,oneooc);
            }
        }
        return flip;
    }
}