/*
Problem: <136. Single Number>
Topic: <Array +HashMap>
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


