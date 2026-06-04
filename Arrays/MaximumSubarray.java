/*
Problem: <53-Maximum Subarray>
Topic: <Array >
Approach: <Apply brute force>
Time Complexity: O(n^3)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum1=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length ; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum += nums[k];
                }
                sum1 = Math.max(sum1, sum);
            }
        }
        return sum1;
    }
}

/*
Problem: <53-Maximum Subarray>
Topic: <Array >
Approach: <Apply Kadan Algo calculate curr and max sum>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for(int i=1; i<nums.length; i++){
            currsum = Math.max(nums[i], nums[i]+currsum);
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }
}
