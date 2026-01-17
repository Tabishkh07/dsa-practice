/*
Problem: <1929: Concatenation of Array>
Topic: <Array>
Approach: <1st add the original, then repeat>
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int [nums.length*2];
        for(int i=0; i<ans.length; i++){
            if(i<nums.length){
                ans[i] = nums[i];
                continue;
            }
            ans[i] = nums[i-nums.length];
        }
        return ans;
    }
}
