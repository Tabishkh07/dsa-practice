/*
Problem: <Sqaure of Sorted Arrays>
Topic: <Array + Two Pointer>
Approach: <Check the absoute value of each left and right which ever is greater place it>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int arr[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                arr[i] = nums[left] * nums[left];
                left++;
            }
            else if((Math.abs(nums[left])) < (Math.abs(nums[right]))){
                arr[i] = nums[right] * nums[right];
                right--;
            }
            else{
                arr[i] = nums[left] * nums[left];
                left++;
            }
        }
        return arr;
    }
}
