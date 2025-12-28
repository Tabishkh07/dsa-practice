/*
Problem: <189 - Rotate Array>
Topic: <Array>
Approach: <can be done by using modulus operator - k%n index pe place it>
Time Complexity: O(n)
Space Complexity: O(n) not optimal.
*/
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[(k+i)%n] =nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=arr[i];
        }
    }
}

/*
Problem: <189 - Rotate Array>
Topic: <Array>
Approach: <can be done by using modulus operator - k%n index pe place it>
Time Complexity: O(n)
Space Complexity: O(n) not optimal can be done in O(1) space.
*/
