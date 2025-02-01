class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int xor = nums[i - 1] ^ nums[i];
            if ((xor & 1) != 1) {  // Corrected parentheses
                return false;  // If any pair fails the condition, return false
            }
        }
        return true;  // If all pairs satisfy the condition, return true
    }
}
