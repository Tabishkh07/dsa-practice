/*
Problem: <1108: Defanging an IP Address>
Topic: <String>
Approach: <check the position of "." delete it and insert "[.]">
Time Complexity: O(n)
Space Complexity: O(n)
*/

// best approch (manual) replacing
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<address.length(); i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                sb.append("[.]");
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

// other way round -shortest way
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

// my approach
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
