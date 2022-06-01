class Solution {
    int minL = 0;
    int maxR = 0;
    public String longestPalindrome(String s) {
         if(s.length() <=1){
            return s;
        }
        String res = s.charAt(0)+"";
        
        for(int i = 0;i<s.length();i++){
            if(maxR - minL + 1 == s.length()){
                return s;
            }
            if(i>0 && i+1 < s.length() && s.charAt(i-1)== s.charAt(i+1)){
                int l = i -1;
                int r = i + 1;
                expand(s,l,r);
            }
            if( i+1 < s.length() && s.charAt(i)== s.charAt(i+1)){
                int l = i;
                int r = i + 1;
                expand(s,l,r);
            }
        }
        return s.substring(minL, maxR+1);
    }
    public void expand(String s, int l, int r){
        while(l>=0 && r < s.length() && s.charAt(l)==s.charAt(r)){
                    if((r-l+1) > (maxR - minL + 1)){
                        minL = l;
                        maxR = r;
                    }
                    l--;
                    r++;
        }
    }
}