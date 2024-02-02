class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> a= new ArrayList<>();
        for(int i=1; i<=9; ++i){
            int num = i;
            int next = i+1;
            while(num<=high && next<=9){
                num = num*10 + next;
                
                if(num>=low && num<=high){
                    a.add(num);
                }
                ++next;
            }
            
        } 
        a.sort(null);
        return a;
    }
}