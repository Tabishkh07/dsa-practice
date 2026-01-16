/*
Problem: < 2652: Sum Multiples>
Topic: <Array>
Approach: <just check condition and add if yes>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%3==0||i%5==0||i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
}
