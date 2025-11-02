import java.util.*;

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n]; // 0 = empty, 1 = guarded, 2 = wall/guard

        // Place walls
        for (int[] w : walls) {
            grid[w[0]][w[1]] = 2;
        }

        // Place guards
        Set<String> guardSet = new HashSet<>();
        for (int[] g : guards) {
            grid[g[0]][g[1]] = 2; // treat as blocking for visibility
            guardSet.add(g[0] + "," + g[1]); // store guard positions
        }

        // Sweep rows
        for (int i = 0; i < m; i++) {
            // Left → Right
            boolean guarded = false;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    guarded = guardSet.contains(i + "," + j);
                    continue;
                }
                if (guarded) grid[i][j] = 1;
            }
            // Right → Left
            guarded = false;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 2) {
                    guarded = guardSet.contains(i + "," + j);
                    continue;
                }
                if (guarded) grid[i][j] = 1;
            }
        }

        // Sweep columns
        for (int j = 0; j < n; j++) {
            // Top → Bottom
            boolean guarded = false;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 2) {
                    guarded = guardSet.contains(i + "," + j);
                    continue;
                }
                if (guarded) grid[i][j] = 1;
            }
            // Bottom → Top
            guarded = false;
            for (int i = m - 1; i >= 0; i--) {
                if (grid[i][j] == 2) {
                    guarded = guardSet.contains(i + "," + j);
                    continue;
                }
                if (guarded) grid[i][j] = 1;
            }
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }

        return count;
    }
}
