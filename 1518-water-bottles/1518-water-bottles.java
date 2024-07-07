class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;  // Total number of bottles you can drink
        int bottles = numBottles;  // Current number of full bottles you have
        int rem = 0;  // Remainder (leftover bottles that can't be exchanged)

        while (bottles + rem >= numExchange) {
            int newBottles = (bottles + rem) / numExchange;  // Number of new full bottles you get
            rem = (bottles + rem) % numExchange;  // Remainder bottles that can't be exchanged
            res += newBottles;  // Update the total count with the new bottles
            bottles = newBottles;  // Update the current full bottles
        }
        
        return res;  // Return the total number of bottles you can drink
    }
}
