/*
Problem: <34. Find First and Last Position of Element in Sorted Array>
Topic: <Two Pointer>
Approach: <find 1st occurance from left and second from right>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] =new int[2];
        arr[0] = -1;
        arr[1] = -1;
        if(nums.length == 0){
            return arr;
        }
        int i=0; int j=nums.length-1;
        while(i<nums.length){
            if(nums[i] == target){
                arr[0] = i;
                break;
            }
            i++;
        }
        while(j>=0){
            if(nums[j] == target){
                arr[1] = j;
                break;
            }
            j--;
        }
        return arr;
    }
}
