/*
Problem: <287. Find the Duplicate Number>
Topic: <Array >
Approach: <Floyd Algorithm - array is from 1 to n so each index leads to next value and if we detect cycle in it then repeated no is 
there just have to find the enterence so we use slow and fast pinters.>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int findDuplicate(int[] nums) {
      int slow=0; 
      int fast=0;

      // first do then check 
      do{
        slow = nums[slow]; // 1 jump;
        fast = nums[nums[fast]]; // 2jumps
      }while(slow!=fast);

      // reset one pointer to find the cycle entrance
      slow=0;
      while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast]
      }
      return slow;
    }
}
