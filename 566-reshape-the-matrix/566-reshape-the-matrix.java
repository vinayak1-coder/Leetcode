class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List <Integer> list = new ArrayList<Integer>();
        if((mat.length*mat[0].length) != (r*c)){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        int[][] arr2 = new int[r][c];
        int d=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=list.get(d);
                d++;
            }
        }
        return arr2;
    }
}