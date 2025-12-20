/*
Problem: <88. Merge Sorted Array>
Topic: <Array>
Approach: <brute force - just add the nums2 in nums1 and sort>
Time Complexity: O(n+m)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}

