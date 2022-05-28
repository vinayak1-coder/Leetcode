class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int widthoverlap = getoverlap(ax1,ax2,bx1,bx2);
        int heightoverlap = getoverlap(ay1,ay2,by1,by2);
        int areaoverlap = 0;
        if(widthoverlap > 0 && heightoverlap >0){
            areaoverlap = widthoverlap * heightoverlap;
        }
        return (ax2-ax1)*(ay2-ay1)+(bx2-bx1)*(by2-by1) - areaoverlap;
        
    }
    private int getoverlap(int left1, int right1, int left2, int right2 ){
        int maxleft = Math.max(left1,left2);
        int maxright = Math.min(right1,right2);
        return maxright-maxleft;
    }
}