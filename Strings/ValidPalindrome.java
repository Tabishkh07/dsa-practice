/*
Problem: <125 - Valid Palindrome>
Topic: <String>
Approach: <1st convert all to lower case and remove all letters nd spaces, check from front and back for same element>
Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public boolean isPalindrome(String s) {
        String in = s.toLowerCase()
                        .replaceAll("[^a-z0-9]","");
        
            int start=0,end=in.length()-1;
            while(start < end){
                if(in.charAt(start) != in.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
    }
}
