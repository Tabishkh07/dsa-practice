/*
Problem: <232 - ImplementQueueusingStacks>
Topic: <Stack>
Approach: <when new element comes move all the elements from 1 to 2 then add the element then move from 2 to 1>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class MyQueue {
        Stack<Integer> st1;
        Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        if(!st1.isEmpty()){
            return st1.pop();
        }else{
            return -1;
        }
    }
    
    public int peek() {
        if(!st1.isEmpty()){
            return st1.peek();
        }else{
            return -1;
        }
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}
