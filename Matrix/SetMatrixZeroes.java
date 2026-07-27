/*
Problem: <73. Set Matrix Zeroes>
Topic: <Array >
Approach: <Array for 0 on x and 0 on y axis , then store all zero pos in matrix and then later set matrix all 0 in row and col == 0>
Time Complexity: O(n*m)
Space Complexity: O(n+m)
*/

class Solution {
    public void setZeroes(int[][] matrix) {
      boolean x[] = new boolean[matrix.length];
      boolean y[] = new boolean[matrix[0].length];

      for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
          if(matrix[i][j] == 0){
            x[i] = true;
            y[j] = true;
          }
        }
      }

      for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
          if(x[i] || y[j]){
            matrix[i][j] = 0;
          }
        }
      }
    }
}
