/*
Problem: <724. Find Pivot Index>
Topic: <Array>
Approach: <Calculated total sum of the array and maintained a running left sum.
At each index, checked if left sum equals right sum to find the pivot index.>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int pivotIndex(int[] nums) {
        int totals=0;
        int lefts=0;
        for(int i=0;i<nums.length; i++){
            totals+=nums[i];
        }
        for(int i=0;i<nums.length; i++){
            if(lefts == totals - lefts- nums[i]){
                return i;
            }
            lefts+=nums[i];
        }
        return -1;
    }
}
