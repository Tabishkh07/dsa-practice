/*
Problem: <3190: Find Minimum Operations to Make All Elements Divisible by Three >
Topic: <Array>
Approach: <just check 1 or 2 inc the operation count >
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int minimumOperations(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i]%3;
            if(n==1 || n==2){
                count++;
            }
        }
        return count;
    }
}
