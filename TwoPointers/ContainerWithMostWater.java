/*
Problem: < 11: Container With Most Water>
Topic: <Array + Two Pointer>
Approach: <Use two pointers at both ends, calculate area using width × smaller height, and keep track of the maximum area.
Move the pointer with the smaller height inward because only that can potentially increase the area.>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int sum = 0;

        while(i<j){
            int min = Math.min(height[i], height[j]);
            int water = (j-i) * min;
            sum = Math.max(sum, water); 

            if(height[i] < height[j]){
                i++;
            } else{
                j--;
            }
        }
        return sum;
    }
}
