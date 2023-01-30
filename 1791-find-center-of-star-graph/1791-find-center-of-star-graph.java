import java.util.HashSet;
import java.util.Set;
class Solution {
    public int findCenter(int[][] edges) {
       Set<Integer> found=new HashSet<>();
        for(int[] edge : edges){
            if(found.contains(edge[0])){
                return edge[0];
            }
            found.add(edge[0]);
            if(found.contains(edge[1])){
                return edge[1];
            }
            found.add(edge[1]);
        }
        return 0;
    }
}