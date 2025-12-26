/*
Problem: <367. Valid Perfect Square>
Topic: <Binary Search>
Approach: <Apply binary search for best time result>
Time Complexity: O(logn)
Space Complexity: O(1)
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start<=end){
            int mid = (start+end)/2;
            long m = (long) mid*mid;
            if(m==num){
                return true;
            }
            else if(m>num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
