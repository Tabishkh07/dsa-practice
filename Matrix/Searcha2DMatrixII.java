/*
Problem: <240. Search a 2D Matrix II>
Topic: <Array >
Approach: <Start from top right corner with 3 conditions>
Time Complexity: O(m+n)
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0, j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j] < target){
                i++;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                return true;
            }
        }
        
        return false;
    }
}
