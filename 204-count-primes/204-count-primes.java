class Solution {
    public int countPrimes(int n) {
    boolean[] notPrime = new boolean[n];
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                c++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return c; 
    }
}