/*
Problem: <238. Product of Array Except Self>
Topic: <Array>
Approach: <Prefix Product + Suffix Product (without extra arrays).>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
      int answer[] = new int[nums.length];
      // since its multiplication and array default is 0 so change it to 1.
      Arrays.fill(aswer, 1);

      for(int i=1; i<nums.length; i++){
        answer[i] = answer[i-1] * nums[i-1];
      }

      int right=1;
      for(int i=nums.length-1; i>=0; i--){
        answer[i] *= right;
        right *= nums[i];
      }
      
      return answer;
    }
}
