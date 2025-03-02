class Solution {
    int count = 0;
            private Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        count = helper(n);
        return count;
    }

    public int helper(int n){
        if(n==0){
            return 1;
        }
        else if(n<0)    return 0;
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        else{
            int ways = helper(n-1) + helper(n-2);
            memo.put(n, ways);
            return ways;
        }
    }
}