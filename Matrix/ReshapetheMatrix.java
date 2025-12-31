/*
Problem: <566. Reshape the Matrix>
Topic: <Array + matrix>
Approach: <Reshapes a given matrix into a new dimension while preserving row-wise order.
Returns the original matrix if reshape is not possible due to size mismatch.>
Time Complexity: O(m+n)
Space Complexity: O(r*c)
*/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        // if reshape is not possible
        if (m * n != r * c) {
            return mat;
        }
        int[][] res = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return res;
    }
}
