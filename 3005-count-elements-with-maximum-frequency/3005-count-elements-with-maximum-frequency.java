
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int a[]=new int[101];
        for(int i:nums)
        {
            a[i]++;
        }
        int m=0;
        for(int i=0;i<=100;i++)
        {
            m=Math.max(m,a[i]);
        }
        int ans=0;
        for(int i=0;i<=100;i++)
        {
            if(a[i]==m)
            {
                ans+=m;
            }
        }
        return ans;
    }
}