/*
Problem: <66 Plus One>
Topic: <Array>
Approach: <1st count all 9 in array then if count = length of array then make new array with 0 as 1 and rest 0 else find last index of 9
and add 1 to no before it and rest 0>
Time Complexity: O(n)
Space Complexity: O(n) for Worst Case(all 9 case); O(1)
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        int lastpos = digits.length-1;
        while(lastpos >= 0 && digits[lastpos] == 9){
            count++;
            lastpos--;
        }
        int edit = digits.length-1-count;
        if(count<digits.length){
            digits[edit] = digits[edit]+1;
            for(int i=digits.length-1; i>edit; i--){
                digits[i] = 0;
            }
        }
        else if(count == digits.length){
            int n = digits.length;
            int arr[] = new int[n+1];
            arr[0] = 1;
            for(int i=1; i<arr.length; i++){
                arr[i] = 0;
            }
            return arr;
        }
        return digits;
    }
}
