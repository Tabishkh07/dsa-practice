/*
Problem: <387. First Unique Character in a String>
Topic: <String + HashMap>
Approach: <1st store all char in hashmap with frequency
          2nd now check which key value is 1 using get function>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        // now find unique element
        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
