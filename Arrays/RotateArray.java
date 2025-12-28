/*
Problem: <189 - Rotate Array>
Topic: <Array>
Approach: <can be done by using modulus operator - k%n index pe place it>
Time Complexity: O(n)
Space Complexity: O(n) not optimal can be done in O(1) space.
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
Space Complexity: O(1)
*/
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // for cases where k>n
        k = k%n; 
        // 1st reverse the array - [7,6,5,4,3,2,1]
        reverse(nums, 0, n-1);
        // reverse the 1st half - [5,6,7,4,3,2,1]
        reverse(nums, 0, k-1);
        // reverse the 2nd half - [5,6,7,1,2,3,4]
        reverse(nums, k, n-1);

    }
    public void reverse(int arr[], int l, int r){
        while(l<r){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
    }
}
