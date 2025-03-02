class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> ans = new ArrayList<>();
       int p1=0, p2=0;
       while(p1<nums1.length && p2<nums2.length){
        if(nums1[p1][0]==nums2[p2][0]){
            ans.add(new int[]{nums1[p1][0], nums1[p1][1]+nums2[p2][1]});
            p1++;
            p2++;
        }
        else if(nums1[p1][0]<nums2[p2][0]){
             ans.add(new int[]{nums1[p1][0], nums1[p1][1]});
             p1++;
        }
        else{
             ans.add(new int[]{nums2[p2][0], nums2[p2][1]});
             p2++;
        }
       } 

       while(p1<nums1.length){
                     ans.add(new int[]{nums1[p1][0], nums1[p1][1]});
             p1++;

       }

            while(p2<nums2.length){
                         ans.add(new int[]{nums2[p2][0], nums2[p2][1]});
             p2++;
        }
       return ans.toArray(new int[ans.size()][]);
    }
}