/*
Problem: <Reverse String>
Topic: <Arrays + String>
Approach: <just swap half the length, swapping full length will give same result>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverseString(char[] s) {
        char c=' ';
        int n=s.length;
        for(int i=0; i<s.length/2; i++){
            c = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = c;
        }
    }
}
