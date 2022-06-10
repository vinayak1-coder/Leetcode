class Solution {
    public boolean isValid(String s) {
          Stack<Character> E= new Stack<>();  
        for(int i=0;i<s.length();i++){
            if ((s.charAt(i) == ')' && !E.isEmpty() && E.peek() == '(') || (s.charAt(i) == '}' && !E.isEmpty() && E.peek() == '{') || (s.charAt(i) == ']' && !E.isEmpty() && E.peek() == '[')){
                E.pop();
            }
            else{
                E.push(s.charAt(i));
            }
        }
        return E.empty();
    }
}