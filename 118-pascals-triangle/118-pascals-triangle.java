import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return triangle;
        List<Integer> row , pre=null;
        for(int i=0;i<numRows;i++){
            row = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(pre.get(j-1)+pre.get(j));
                }
                
            }
            pre = row;
            triangle.add(row);
        }
        return triangle;
    }
}