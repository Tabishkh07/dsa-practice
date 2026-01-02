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
/*
Problem: <448 — Find All Numbers Disappeared in an Array>
Topic: <Array>
Approach: <for a number x mark its index negative (means it has appear) now which number are positive thier indices are the one that
dosen't appear>
Time Complexity: O(n)
Space Complexity: O(1) 
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>al = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                al.add(i+1);
            }
        }
        return al;
    }
}
