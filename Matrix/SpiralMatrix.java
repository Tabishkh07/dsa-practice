/*
Problem: <54. Spiral Matrix>
Topic: <Array >
Approach: <>
Time Complexity: O(m * n)
Space Complexity: O(1)
*/

class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int sr = 0, sc =0;
        int er = nums.length-1, ec = nums[0].length-1;
        while(sr<=er && sc<=ec){
            for(int i=sc; i<=ec; i++){
                al.add(nums[sr][i]);
            }

            for(int i=sr+1; i<=er; i++){
                al.add(nums[i][ec]);
            }

            if(sr != er){
                for(int i=ec-1; i>=sc; i--){
                    al.add(nums[er][i]); 
                }
            }
            
            if(sc!=ec){
                for(int i=er-1; i>sr; i--){
                    al.add(nums[i][sc]);
                }
            }
            
            sr++;
            sc++;
            er--;
            ec--;
        }
        return al;
    }
}
