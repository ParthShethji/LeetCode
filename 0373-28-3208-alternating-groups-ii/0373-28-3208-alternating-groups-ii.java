class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int validPositions = 0;

        // Step 1: Identify positions that form alternating sequences
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[(i + 1) % n]) {
                validPositions++; // Valid start for an alternating sequence
            }
        }

        // Step 2: Count valid k-sized groups
        int alternatingInWindow = 0;

        // Initialize first window of size k
        for (int i = 0; i < k - 1; i++) {
            if (colors[i] != colors[i + 1]) alternatingInWindow++;
        }

        // Sliding window to check all groups in O(n)
        for (int i = 0; i < n; i++) {
            int start = i;
            int end = (i + k - 1) % n; // Circular index

            // Add new boundary check
            if (colors[end] != colors[(end + 1) % n]) alternatingInWindow++;

            // Remove old boundary check
            if (colors[start] != colors[(start + 1) % n]) alternatingInWindow--;

            // If window is valid, increment count
            if (alternatingInWindow == k - 1) count++;
        }

        return count;
    }
}
