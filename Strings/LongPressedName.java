/*
Problem: <925: Long Pressed Name >
Topic: <Array + String>
Approach: <Move through both strings together; typed is valid only if it follows the same order as name and any extra letters are just 
repeats of the previous one.>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        while(j<typed.length()){
            if(i<name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>0 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        return i == name.length();
    }
}
