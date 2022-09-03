class Solution {
    public int islandPerimeter(int[][] grid) {
        int land=0,neighbour=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    land++;
                    if(i<grid.length-1 && grid[i+1][j]==1){
                        neighbour++;
                    }
                    if(j<grid[i].length-1 && grid[i][j+1]==1){
                        neighbour++;
                    }
                }
            }
        }
        return land*4 - neighbour*2;
    }
}