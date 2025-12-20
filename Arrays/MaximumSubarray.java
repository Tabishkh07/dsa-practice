/*
Problem: <53-Maximum Subarray>
Topic: <Array >
Approach: <Apply Kadan Algo calculate curr and max sum>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for(int i=1; i<nums.length; i++){
            currsum = Math.max(nums[i], nums[i]+currsum);
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }
}
