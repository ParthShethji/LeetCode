class Solution {
    private static final int MOD = 1_000_000_007;
    
    public int numOfSubarrays(int[] arr) {
        int even = 1, odd = 0, sum = 0, result = 0;

        for (int a : arr) {
            sum += a;
            if (sum % 2 == 0) {
                even++;
                result = (result + odd) % MOD; // Apply modulo
            } else {
                odd++;
                result = (result + even) % MOD; // Apply modulo
            }
        }
        
        return result;
    }
}
