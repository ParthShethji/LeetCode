class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            int num = i;
            int digits = 0;
            int temp = num;

            // Find number of digits
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            if (digits % 2 != 0) continue; // Only even digits

            int half = digits / 2;
            int pow = (int)Math.pow(10, half);

            int left = num / pow;   // First half
            int right = num % pow;  // Second half

            if (digitSum(left) == digitSum(right)) {
                count++;
            }
        }

        return count;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
