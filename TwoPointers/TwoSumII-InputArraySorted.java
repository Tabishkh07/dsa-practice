/*
Problem: <Two Sum II - Input Array Is Sorted>
Topic: <Array + Two Pointer>
Approach: <check for 1 number at a time do this n times >
Time Complexity: O(n^2)
Space Complexity: O(1)
but this will give TIME LIMIT EXCEED problem.
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j] == target){
                    arr[0] = i+1;
                    arr[1] = j+1;
                }
            }
        }
        return arr;
    }
}

/*
Problem: <Two Sum II - Input Array Is Sorted>
Topic: <Array + Two Pointer>
Approach: <check for two start and end if their sum >target reduce end if less than target increase start>
Time Complexity: O(logn)
Space Complexity: O(1)
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[start]+numbers[end] == target){
                arr[0] = start+1;
                arr[1] = end+1;
                return arr;
            }
            else if(numbers[start]+numbers[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        return arr;
    }
}
