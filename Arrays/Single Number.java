/*
Problem: <136. Single Number>
Topic: <Array>
Approach: <Brute force>
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if(count < 2){
                return nums[i];
            }
        }
        return -1;
    }
}

/*
Problem: <136. Single Number>
Topic: <Array + HashMap>
Approach: <Insert all values in HashMap along with frequency of apperance and then find the key with the help of value using entrySet>
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1)
            return entry.getKey();
        }
        return -1;
    }
}

/*
Problem: <136. Single Number>
Topic: <Array>
Approach: <Bit Manuplation - Using the special property of bit = duplicate no - 0 and single give same no>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int num : nums){
            ans ^=num;
        }
        return ans;
    }
}
