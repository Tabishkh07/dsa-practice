/*
Problem: <79. Word Search>
Topic: <Array + Backtracking>
Approach: <Backtracking (DFS) — start from every cell, recursively explore 4 directions, mark the current cell as visited, then restore it after exploring.>
Time Complexity: O(m × n × 4 × 3^(L−1))
Space Complexity: O(L)
*/

class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(check(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board, String word, int i, int j, int k){
        if(k==word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }

        if(word.charAt(k) != board[i][j]){
            return false;
        }

        // now mark as read and moving
        char temp=board[i][j];
        board[i][j] = '@';

        // now checking and backtracking 
        boolean and = check(board, word, i+1, j, k+1) || 
        check(board, word, i, j+1, k+1) || check(board, word, i, j-1, k+1) || check(board, word, i-1, j, k+1);

        board[i][j] = temp;
        return and;
    }
}
