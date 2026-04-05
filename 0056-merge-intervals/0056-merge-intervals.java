class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        //sort on 1st element uing compartor
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //see if second ele of 1st greter than 1st ele of second and keep updating
        for(int i=0; i<intervals.length; i++){
            int a = intervals[i][0];
            int b= intervals[i][1];
            while(i+1<intervals.length && b>=intervals[i+1][0]){
                i++;
                b = Math.max(intervals[i][1], b);

            }
            ans.add(new int[]{a,b});

        }

        return ans.toArray(new int[ans.size()][]);
    }
}