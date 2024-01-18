import java.util.HashMap;
import java.util.Map;

class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> table = new HashMap<>();
        return climbStairsHelper(n, table);
    }

    private int climbStairsHelper(int n, Map<Integer, Integer> table) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (table.containsKey(n)) {
            return table.get(n);
        }

        int ways = climbStairsHelper(n - 1, table) + climbStairsHelper(n - 2, table);
        table.put(n, ways);

        return ways;
    }
}
