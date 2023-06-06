class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> s = new HashSet<>();
        int[] a = new int[A.length];
        int b = 2;
        for(int i=0; i<A.length; i++) {
            s.add(A[i]); s.add(B[i]);
            a[i] = b - s.size();
            b+=2;
        }
        return a;
    }
}