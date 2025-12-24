/*
Problem: <26-Remove Duplicates from Sorted Array>
Topic: <Array + Two Pointer>
Approach: <store in hashset to remove repeated elements then store them to array then patial sort till hashset length>
Time Complexity: O(nlogn)
Space Complexity: O(n)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int i=0;
        for (int x : hs) {
            nums[i] = x;
            i++;
        }
        Arrays.sort(nums, 0, hs.size());
        return hs.size();
    }
}

