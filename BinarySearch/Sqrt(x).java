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

/*
Problem: <69 - Sqrt(x)>
Topic: <Binary Search>
Approach: <just check for smaller or equal an store it, and keep further checking for maybe bigger no is also possible>
Time Complexity: O(logn)
Space Complexity: O(1)
*/

class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return x;
        }
        int start=0; int end=x;
        int ans=0;
        while(start<=end){
            int mid = (start+end)/2;
            long m= (long)mid*mid;
            if(m<=x){
                ans= mid;
                start = mid+1;  
            }else{
                end= mid-1;
            }
        }
        return ans;
    }
}
