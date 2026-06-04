/*
Problem: < 75: Sort Colorr>
Topic: <Array + Two Pointer>
Approach: <Count and arrange - 2 phase(1 for counting, 2nd for filling)>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void sortColors(int[] nums) {
        int c0=0, c1=0, c2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                c0++;
            }      
            else if(nums[i] == 1){
                c1++;
            }else{
                c2++;
            }
        }
        for(int i=0; i<c0; i++) 
            nums[i] = 0;
        for(int i=c0; i<c0+c1; i++) 
            nums[i] = 1;
        for(int i=c0+c1; i<nums.length; i++) 
            nums[i] = 2;
    }
}

/*
Problem: < 75: Sort Colorr>
Topic: <Array + Three Pointer>
Approach: <Dutch National Flag Algorithm - 1 phase => divide in 4 parts and arrange acc>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
