/*
Problem: <Move Zeroes>
Topic: <Array + Two Pointer>
Approach: <Move all non-zero's to front using two variables 1 for iteration, 2nd for non-zero index and then at last add zero's>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        // for remaining zeros
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}
