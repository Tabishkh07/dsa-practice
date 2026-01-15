/*
Problem: <1732: Find the Highest Altitude>
Topic: <Array / String / Two Pointer / Sliding Window>
Approach: <1–2 lines explanation>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int i=0; i<gain.length; i++){
            sum +=gain[i];
            max= Math.max(max, sum);
        }
        return max;
    }
}
