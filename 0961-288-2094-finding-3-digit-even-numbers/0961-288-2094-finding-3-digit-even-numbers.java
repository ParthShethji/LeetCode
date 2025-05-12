import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10]; // count of each digit in input

        for (int digit : digits) {
            freq[digit]++;
        }

        List<Integer> result = new ArrayList<>();

        // Loop through all valid 3-digit even numbers
        for (int num = 100; num <= 999; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            // Count digits needed for this number
            int[] count = new int[10];
            count[a]++;
            count[b]++;
            count[c]++;

            boolean canForm = true;
            for (int d = 0; d < 10; d++) {
                if (count[d] > freq[d]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                result.add(num);
            }
        }

        // Convert to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
