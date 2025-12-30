/*
Problem: <58. Length of Last Word>
Topic: <String>
Approach: <trim to remove spaces, last indexof to get white space index then return the length.>
Time Complexity: O(1)
Space Complexity: O(1)
*/
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int c= s.lastIndexOf(' ');
        return s.length()-c-1;
    }
}
