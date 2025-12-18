/*
Problem: <169 Majority Element>
Topic: <Array + HashMap>
Approach: <Store the frequency of all number in hashmap, then check which has greater frequency than n/2>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer>entry: hm.entrySet()){
            if(entry.getValue() > nums.length/2){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
