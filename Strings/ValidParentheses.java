/*
Problem: <20 - Valid Parentheses>
Topic: <String>
Approach: <check for length if even then proceed, now insert all the open tag in stack and as the closing tag comes 
check whether its last tag was of sam kind or not>
Time Complexity: O(n) - run time is 3ms
Space Complexity: O(n)
*/

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
                return false;
            }
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char del = st.pop();
                if((del!='(' && ch==')') || (del!='{' && ch=='}') ||   del!='[' && ch==']'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

/*
Problem: <Valid Parentheses>
Topic: <String>
Approach: <1–2 lines explanation>
Time Complexity: O()
Space Complexity: O()
*/
