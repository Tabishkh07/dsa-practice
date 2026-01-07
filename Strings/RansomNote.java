/*
Problem: <383: Ransom Note>
Topic: <String + HashMap>
Approach: <1️⃣ Count the frequency of each character in magazine using a map (or array).
            2️⃣ For each character in ransomNote, if its count is 0 return false, otherwise decrement it; if all pass return true.>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer>hm = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char ch=magazine.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch=ransomNote.charAt(i);
            if(!hm.containsKey(ch) || hm.get(ch)==0){
                return false;
            }
            hm.put(ch, hm.get(ch)-1);
        }
        return true;
    }
}
