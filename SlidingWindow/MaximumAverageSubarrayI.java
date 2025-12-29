/*
Problem: <643. Maximum Average Subarray I>
Topic: <Sliding Window>
Approach: <First, calculate the sum of the first k elements.
Treat this as the current window sum and initialize maxSum with it.
Slide the window one step at a time:
Subtract the element leaving the window
Add the new element entering the window
Update maxSum
Return maxSum / k>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double max = sum;  // to store valid max instead of zero which fails in case of negative elements
        for(int i=k; i<nums.length; i++){
            sum -= nums[i-k];
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max/k;
    }
}
