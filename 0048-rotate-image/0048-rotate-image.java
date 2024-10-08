class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length-1;
//         transpose matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i>j){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        
//         swap cols from middle
        for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length/2; j++){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[i][n-j];
                    matrix[i][n-j]=temp;            }
        }
    }
}