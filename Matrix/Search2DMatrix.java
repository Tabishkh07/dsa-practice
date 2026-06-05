/*
Problem: <74. Search a 2D Matrix>
Topic: <Array + matrix>
Approach: <using the top-right corner approach for traversal as  its sorted array>
Time Complexity: O(m+n)
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int row = 0;
        while(row<matrix.length && col>=0){
            if(target == matrix[row][col]){
               return true;
            }
            else if(target < matrix[row][col]){
                col --;
            }else{
                row++;
            }
        }
        return false;
    }
}
