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

/*
Problem: <169 Majority Element>
Topic: <Array>
Approach: <Since majority element always exists so we use two variables one to store which element occur most(temp) and other element
to count how many times.>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; 
        int ans = 0;
        for(int num : nums){
            if(count == 0){
                ans = num;
            }
            
            if(ans == num){
                count++;
            }else{
                count--;
            }
        }
        return ans;
    }
}

// IMAGINE A PROBLEM WHERE MAJORITY ELEMENT DOSENT EXIST THEN ?
class Solution {
    public int majorityElement(int[] nums){
        int candidate = nums[0];
        int count = 0;
        for(int i: nums){
            if(count == 0){
                candidate = i;
            }
            if(candidate == i){
                count ++;
            }
            else{
                count --;
            }
        }
        return count > nums.length/2 ? candidate: -1;
    }
}
