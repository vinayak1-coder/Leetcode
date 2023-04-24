class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length<=1){
            return asteroids;
        }
        Stack<Integer> st=new Stack<>();
        for(int asteroid:asteroids){
            if(asteroid > 0){
                st.push(asteroid);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && Math.abs(st.peek())<Math.abs(asteroid)){
                    st.pop();
                }
            if(st.isEmpty() || st.peek()<0){
                st.push(asteroid);
            }
            else if(st.peek()==Math.abs(asteroid)){
                st.pop();
            }
        }
        }
        int[] output=new int[st.size()];
        for(int i=output.length-1;i>=0;i--)
            output[i]=st.pop();
        
        return output;
    }
}