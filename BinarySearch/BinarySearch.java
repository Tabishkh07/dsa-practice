/*
Problem: <Binary Search>
Topic: <Array>
Approach: <Find the middle index check 3 conditions if nums is present at 1.at mid 2.less than mid 3.more than mid
Time Complexity: O(logn)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
