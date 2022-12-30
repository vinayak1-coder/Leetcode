class Solution {
    public String longestNiceSubstring(String s) {
        int length = s.length();
        String maxStr = "";
        for(int left = 0; left < length; left++){
            for(int right = left+1; right < length; right++){
              String sub = s.substring(left, right + 1);
              if(isNice(sub) && sub.length() > maxStr.length())
                  maxStr = sub;
            }
        }
        return maxStr;
    }
    
    private boolean isNice(String str){
        Map<Character, Integer> map = new HashMap();
        
        for(int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) +1);
        
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            
            if(Character.isLowerCase(entry.getKey()))
                if(!map.containsKey(Character.toUpperCase(entry.getKey())))
                    return false;
            if(!Character.isLowerCase(entry.getKey()))
                if(!map.containsKey(Character.toLowerCase(entry.getKey())))
                    return false;
        }
        return true;
    }
}