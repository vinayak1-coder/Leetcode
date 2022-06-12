class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        
        char[] ch = new char[pattern.length()]; 
        
        for(int i = 0; i < pattern.length(); i++) 
        {
            ch[i] = pattern.charAt(i);
        }
      
        if(ch.length != words.length) 
        {
            return false;
        }
          HashMap <Character, String> map = new HashMap(); 
       
        for(int i = 0; i < words.length; i++) 
        {
            char Character = ch[i]; 
            String word = words[i];
            
            if(!map.containsKey(Character) && !map.containsValue(word)) 
            {
                map.put(Character, word);
            }
            
            if((!map.containsKey(Character) && map.containsValue(word)) || (!map.get(Character).equals(word)))
            {
                return false;
            }
        }
        return true;    
    }
}