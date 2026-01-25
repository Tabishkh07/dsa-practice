/*
Problem: < 844: Backspace String Compare>
Topic: <Array + Two Pointer>
Approach: <We traverse both strings and use StringBuilder to simulate the typing process by appending characters and removing the 
last character whenever # is encountered. After processing both strings, we convert them into strings and compare them using the 
.equals() method to determine if they are equal.>
Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                if(sb1.length() > 0)
                sb1.deleteCharAt(sb1.length() - 1);
            }else{
                sb1.append(s.charAt(i));
            }
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == '#'){
                if(sb2.length() > 0)
                sb2.deleteCharAt(sb2.length() - 1);
            }else{
                sb2.append(t.charAt(i));
            }
        }
        return sb1.toString().equals(sb2.toString())? true: false;
    }
}
