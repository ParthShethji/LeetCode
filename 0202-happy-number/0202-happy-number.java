class Solution {
    public boolean isHappy(int n) {
        while(n>4){
            int summ = 0;
            while(n>0){
                int temp = n%10;
                summ += temp * temp;
                n -= temp;
                n /= 10;
            }
            n = summ;

        }

        return n==1;
    }
}