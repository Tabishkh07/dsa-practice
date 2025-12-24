/*
Problem: <26-Remove Duplicates from Sorted Array>
Topic: <Array + HashSet>
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

/*
Problem: <26-Remove Duplicates from Sorted Array>
Topic: <Array + Two Pointer>
Approach: <take 2 pointers 1 for index other for traversing, if i != j then inc i and store nums at i>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
        
    }
}
