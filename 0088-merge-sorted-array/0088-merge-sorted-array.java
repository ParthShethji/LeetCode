class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = nums1.length-1, b=n;
        n=n-1;
        m=m-1;
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[a]=nums1[m];
                m--;
                a--;
            }
            else{
                nums1[a]=nums2[n];
                n--;
                a--;
            }
        }
        
        while(n>=0){
            nums1[a]=nums2[n];
                     n--;
                a--;
        }
    }
}