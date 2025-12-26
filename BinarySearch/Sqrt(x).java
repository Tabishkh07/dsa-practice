/*
Problem: <69 - Sqrt(x)>
Topic: <Binary Search>
Approach: <Brute force - just check each and every number till number for square till i<=number>
Time Complexity: O(n)
Space Complexity: O(1)
but it will give Time Limit Exceeded.
*/

class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return x;
        }
        for(int i=x; i>1; i--){
            if(i*i<=x){
                return i;
            }
        }
        return -1;
    }
}
