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

/*
Problem: <74. Search a 2D Matrix>
Topic: <Array + matrix>
Approach: <**Approach:** Treat the 2D matrix as a sorted 1D array and apply binary search, converting `mid` into `(row, col)` using `/` and `%`.
>
Time Complexity: O(log m*n)
Space Complexity: O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int end=cols * rows - 1;
        int start=0;
        while(start <= end ){

            int mid = (start+end)/2;
            int row = mid/cols;
            int col = mid%cols;

            if(matrix[row][col] < target){
                start = mid+1;
            }else if(matrix[row][col] > target){
                end = mid-1;
            }else{
                return true;
            }   
        }    
        return false;
    }
}
