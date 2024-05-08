class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, score[i]);
        }
        
        int[] ranks = new int[max+1];
        for(int i=0; i<n; i++){
            ranks[score[i]] = i+1;
        }
        
        String[] ans = new String[n];
        int place = 1;
        
        for(int i=max; i>=0; i--){
            if(ranks[i]==0)  continue;
            int actualIndex = ranks[i]-1;
            if(place==1)    ans[actualIndex]="Gold Medal";
            else if(place==2)   ans[actualIndex]="Silver Medal";
            else if(place==3)   ans[actualIndex]="Bronze Medal";
            else{
                ans[actualIndex] = String.valueOf(place);
            }
            place++;
        }
        return ans;
    }
}
