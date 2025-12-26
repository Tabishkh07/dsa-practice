/*
Problem: <35 - Search Insert Position>
Topic: <Array + BinarySearch>
Approach: <Start stores the position where if element is not there then it should come there>
Time Complexity: O(logn)
Space Complexity: O(1)
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+ end)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]> target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
