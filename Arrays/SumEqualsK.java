/*
Problem: <560. Subarray Sum Equals K>
Topic: <Array>
Approach: <Brute Force - check fro every element.>
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        
        // for checking groups.        
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                if(sum == k){
                    count ++;
                }  
            }          
        }
        return count;
    }
}
