/*
Problem: <414: Third Maximum Number>
Topic: <Array >
Approach: <Sort the array, traverse from the end counting distinct values, and return the 3rd distinct 
number; if fewer than 3 exist, return the maximum.>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int distinct = 1;               // max is always distinct
        int max = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinct++;
            }

            if (distinct == 3) {
                return nums[i];
            }
        }

        return max;   // less than 3 distinct elements
    }
}









