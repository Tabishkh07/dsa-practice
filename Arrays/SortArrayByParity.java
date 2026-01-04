/*
Problem: <905: Sort Array By Parity>
Topic: <Array>
Approach: <Brute Force - 1st check for even add them then check for odd add them>
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums;
        }
        int arr[] = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}

/*
Problem: <905: Sort Array By Parity>
Topic: <Array>
Approach: <Optimised - check fo reven number found swap it to index=0 and keep on increasing>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums;
        }
        int temp=0;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
              temp = nums[j];
              nums[j] = nums[i];
              nums[i] = temp;
              j++;
            }
        }
      return nums;
    }
}
