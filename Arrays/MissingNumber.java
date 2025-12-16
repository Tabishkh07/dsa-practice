/*
Problem: <268 Missing Number>
Topic: <Array + HashSet>
Approach: <Insert the data into hashset , then check if its present>
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        for(int i=0; i<=nums.length; i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
