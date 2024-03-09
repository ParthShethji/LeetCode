class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l1 = 0, l2 =0;
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0])
            return -1;
        while(l1 < nums1.length && l2<nums2.length){
            if(nums1[l1]==nums2[l2])    return nums1[l1];
            else if(nums1[l1] > nums2[l2]){
                l2++;
            }else{
                l1++;
            }
        }
        return -1;
    }
}