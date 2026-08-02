/*
Problem: <. Maximize Pair Strength Using GCD>
Topic: <Array>
Approach: <all pairs and now for GCD - a%b == 0 so b is else again b and remainder>
Time Complexity: O(n^2logM)
Space Complexity: O(logM)
*/

class Solution {
    public long maxPairStrength(int[] nums) {
    
        long max = 0;
        
        for(int j=0; j<nums.length; j++){
        for(int i= j+1; i<nums.length; i++){
            long a = (long)nums[i] * nums[j];
            long b = gcd(nums[i], nums[j]);
            max = Math.max(max, a/(b*b));
        }
        }
        
        return max;
    }

    public long gcd(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if(max%min == 0){
            return min;
        }else{
            return gcd(max%min, min);
        }
    }
}©leetcode
