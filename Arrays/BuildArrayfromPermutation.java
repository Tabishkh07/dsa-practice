/*
Problem: <1920 Build Array from Permutation>
Topic: <Array>
Approach: <brute force - simply follow the instructions>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i:nums){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}

