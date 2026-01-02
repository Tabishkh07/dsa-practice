/*
Problem: <448 — Find All Numbers Disappeared in an Array>
Topic: <Array + HashSet>
Approach: <Store all numbers in hashset to avoid the duplicates then check each number>
Time Complexity: O(n)
Space Complexity: O(n)   //not allowed extra space.
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        for(int i=1; i<=nums.length; i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
        return al;
    }
}
