class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalCost = 0;
        int maxCostInGroup = neededTime[0];

        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                // Add smaller cost
                totalCost += Math.min(maxCostInGroup, neededTime[i]);
                
                // Update max cost in current group
                maxCostInGroup = Math.max(maxCostInGroup, neededTime[i]);
            } else {
                maxCostInGroup = neededTime[i];
            }
        }
        
        return totalCost;
    }
}
