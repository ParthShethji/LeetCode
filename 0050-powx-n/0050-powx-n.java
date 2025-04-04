class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        if(x==1)    return x;
        if(n<0){
            x=1/x;
            n= -n;
        }
        else if(n==0){
            return 1;
        }
        
        while(n!=0){
            if((n&1)!=0){
                ans *= x;
            }
            x*=x;
            n>>>=1;
        }
        return ans;
    }
}