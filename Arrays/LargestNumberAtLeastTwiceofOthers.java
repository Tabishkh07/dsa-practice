/*
Problem: <747: Largest Number At Least Twice of Others >
Topic: <Array>
Approach: <Find the largest and second-largest elements, then check if the largest is at least twice the second-largest>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1, secondMax = -1, index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? index : -1;
    }
}
