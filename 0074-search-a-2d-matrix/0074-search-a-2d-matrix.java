class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //i*COL+j

        int col = matrix[0].length;
        int start = 0;
        int end = (matrix[0].length*matrix.length)-1;

        while(start<=end){
            int mid=start+end;
                mid=mid/2; 
            int j=mid%col; 
            int i=mid/col;

            if(matrix[i][j] == target)
               return true;
            else if(target < matrix[i][j])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }        
        }

        return false;
    }
}