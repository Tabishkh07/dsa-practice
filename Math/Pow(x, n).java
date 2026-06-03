/*
Problem: <50: Pow(x, n)>
Topic: <Math Calculation>
Approach: <Brute Force - Using math function>
Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public double myPow(double x, int n) {
        return (double) Math.pow(x, n);
    }
}

/*
Problem: <50: Pow(x, n)>
Topic: <Math Calculation>
Approach: <Using math >
Time Complexity: O(Log n)
Space Complexity: O(log n)
*/

class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(n<0){
            N = -N;
            return 1/pow(x, N);
        }
        return pow(x, N);
    }

    public double pow(double x, long n){
        double ans =0.0;
        if(n==0){
            return 1;
        }
        if(n%2 == 0){
            ans = pow(x*x, n\2);
        }
        else{
            ans = x * pow(x*x, n\2);
        }
        return ans;
    }
}
