class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] A=new int[rectangles.length];
        int i,max=0,n=0;
        for(i=0;i<rectangles.length;i++)
        {
            if(rectangles[i][0]<rectangles[i][1])
               A[i]=rectangles[i][0];
            else
                A[i]=rectangles[i][1];
            
            if(A[i]>max)
                max=A[i];
        }
        
        for(i=0;i<A.length;i++)
        {
            if(A[i]==max)
                n++;
        }
        return n;
    }
}