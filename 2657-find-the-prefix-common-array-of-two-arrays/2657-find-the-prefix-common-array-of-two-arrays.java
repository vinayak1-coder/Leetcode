class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            boolean found=false;
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    found=true;
                }
                if(found && j>=i){
                    
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}