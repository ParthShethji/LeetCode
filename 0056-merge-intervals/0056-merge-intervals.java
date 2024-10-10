class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int[] lst = intervals[0];
        for(int i=1;i<intervals.length; i++){
            int[] curr = intervals[i];
           if(lst[1]>=curr[0]){
               lst[1]=Math.max(lst[1], curr[1]);
           }else{
               ans.add(lst);
               lst = curr;
           }
        }
        
        ans.add(lst);
        
        return ans.toArray(new int[ans.size()][]);
    }
}