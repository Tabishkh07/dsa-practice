/*
Problem: <1480 - Running Sum of 1d Array>
Topic: <Array>
Approach: <new array add the previous to it and update sum to current>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int arr []= new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i]+sum;
            sum=arr[i];
        }
        return arr;
    }
}
