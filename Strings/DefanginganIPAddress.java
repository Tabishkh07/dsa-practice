/*
Problem: <1108: Defanging an IP Address>
Topic: <String>
Approach: <check the position of "." delete it and insert "[.]">
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        sb.append(address);
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == '.'){
               sb.deleteCharAt(i);
               sb.insert(i, "[.]");
                // as we are adding 2 eextra char.
               i=i+2;
            }
        }
        return sb.toString();
    }
}
