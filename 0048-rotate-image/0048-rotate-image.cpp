class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();

        for(int i = 0; i < n / 2; i++) { // layers
            for(int j = i; j < n - i - 1; j++) {

                int temp = matrix[i][j]; // top

                // left -> top
                matrix[i][j] = matrix[n - 1 - j][i];

                // bottom -> left
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];

                // right -> bottom
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];

                // top -> right
                matrix[j][n - 1 - i] = temp;
            }
        }
    }
};