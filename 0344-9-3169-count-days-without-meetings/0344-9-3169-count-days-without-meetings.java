import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        // Sort the meetings by start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int freeDays = 0;
        int lastEnd = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            // Count free days before this meeting starts
            if (start > lastEnd + 1) {
                freeDays += (start - lastEnd - 1);
            }

            // Merge overlapping intervals
            lastEnd = Math.max(lastEnd, end);
        }

        // Count remaining free days after the last meeting
        if (lastEnd < days) {
            freeDays += (days - lastEnd);
        }

        return freeDays;
    }


}
