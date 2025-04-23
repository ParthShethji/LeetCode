class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        for(int i=1; i<=n; i++){
            int digitsum = sum(i);
            count[digitsum]++;
        }
        
        int max = 0;
        for(int i: count){
            max = Math.max(max, i);
        }
        int res = 0;
        for(int i: count){
            if(i==max)  res++;
        }
        return res;
    }

    private int sum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}