/*
Problem: <3512: Minimum Operations to Make Array Sum Divisible by K>
Topic: <Array>
Approach: <First, calculate the total sum of the array since the operations only affect this overall value. Then return sum % k, 
because the remainder shows exactly how many times we must subtract 1 to make the sum divisible by k (0 if it is already divisible>.
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
      // since it return already how many times it should decrease;
        return sum % k;
    }
}
