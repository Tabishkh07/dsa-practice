/*
Problem: <Two Sum>
Topic: <Array>
Approach: <brute Force - using two loops check the target sum>
Time Complexity: O(𝑛^2)
Space Complexity: O()
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((nums[i]+nums[j]) == target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
