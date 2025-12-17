/*
Problem: <1920 Build Array from Permutation>
Topic: <Array>
Approach: <brute force - simply follow the instructions>
Time Complexity: O(n)
Space Complexity: O(n)
Run Time: 1ms
*/

class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}

/*
Problem: <1920 Build Array from Permutation>
Topic: <Array>
Approach: <brute force - simply follow the instructions>
Time Complexity: O(n)
Space Complexity: O(n)
Run time: 0ms
*/
class Solution {
    public int[] buildArray(int[] nums) {
        permutation(nums, 0);
        return nums;
    }

    void permutation(int nums[], int start){
        if(start<nums.length){
        int temp=nums[start];
        int ans=nums[temp];
        permutation(nums, start+1);
        nums[start]=ans;
        }
    }
}
