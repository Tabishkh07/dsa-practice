/*
Problem: <242. Valid Anagram>
Topic: <String + HashMap>
Approach: <store the frequency of each character in map then use other string to check if hashmap dosent contain or freq is <=0 
then fasle else reduce the frequency of that character>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer>hm = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!hm.containsKey(ch) || hm.get(ch)<=0){
                return false;
            }   
            hm.put(ch, hm.get(ch)-1);
        }
        return true;
    }
}

/*
Problem: <242. Valid Anagram>
Topic: <String + Array>
Approach: <store the frequency of each character in array then use other string to check if array freq is <=0 then false else 
reduce the frequency of that character>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(arr[ch-'a']<=0){
                return false;
            }
            arr[ch-'a']--;
        }
        return true;
    }
}
