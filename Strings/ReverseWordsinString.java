/*
Problem: <151. Reverse Words in a String>
Topic: <String + 2 pointer>
Approach: <Scan the string right → left, use end to mark the boundary of the current word, and append each word when you hit a space.
For multiple spaces, keep moving end left so extra spaces are never included; finally append the first word.>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int end =s.length();
        int i = s.length()-1;

        while(i>=0){
            char ch = s.charAt(i);
            if(ch == ' ' && s.charAt(i+1) != ' '){
                sb.append(s, i+1, end);
                sb.append(' ');
            }
            if(ch==' '){
                end=i;
            }
            i--;            
        }
        
        sb.append(s, 0, end);  
        
        return sb.toString();
    }
}
