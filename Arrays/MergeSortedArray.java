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

/*
Problem: <88. Merge Sorted Array>
Topic: <Array>
Approach: <optimized - since last index are 0 of m and m>n we check from last index who ever is greater we put it in nums1 at m+n-1 
position.>
Time Complexity: O(n+m)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m > 0 && n >0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[m+n-1] = nums1[m-1];
                m--;
            }else{
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }

        // if few n are left
        while(n>0){
            nums1[m+n-1] = nums2[n-1];
                n--;
        }
    }
}
