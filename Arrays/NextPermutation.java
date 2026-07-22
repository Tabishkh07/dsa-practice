/*
Problem: <31. Next Permutation>
Topic: <Array + Greedy>
Approach: <Find the pivot point of breaking the order then do swap and reverse.>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        // all in decending order
        if(pivot == -1){
            reverse(nums, 0);
            return;
        }

        int n = nums.length-1;
        while(nums[pivot]>=nums[n]){
            n--;
        }
        
        Swap(nums, pivot, n);
        reverse(nums, pivot+1);

    }

    public void Swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse (int arr[], int start){
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
