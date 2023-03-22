class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int sc=0;
        int ec=matrix.length-1;
        int sr=0;
        int er=matrix[0].length-1;
        while(true){
            for(int i=sr;i<=er;i++){
                list.add(matrix[sc][i]);
            }
            sc++;
            if(sc>ec || sr>er){
                break;
            }
            for(int i=sc;i<=ec;i++){
                list.add(matrix[i][er]);
            }
            er--;
            if(sc>ec || sr>er){
                break;
            }
            for(int i=er;i>=sr;i--){
                list.add(matrix[ec][i]);
            }
            ec--;
            if(sc>ec || sr>er){
                break;
            }
            for(int i=ec;i>=sc;i--){
                list.add(matrix[i][sr]);
            }
            sr++;
            if(sc>ec || sr>er){
                break;
            }
        }
        return list;
    }
}