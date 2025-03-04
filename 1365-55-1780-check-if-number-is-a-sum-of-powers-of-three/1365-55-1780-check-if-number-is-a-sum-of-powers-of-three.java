class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false;  // If remainder is 2, it's impossible
            n /= 3;
        }
        return true;
    }
}
