/*
Problem: <Max Consecutive Ones>
Topic: <Array>
Approach: <check for the 1 if found then continue  else count 0>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count ++;
                max= Math.max(max, count);
                continue;
            }
            else{
                count=0;
            }
        }
        return max;
    }
}
