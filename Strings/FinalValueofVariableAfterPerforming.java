/*
Problem: < 2011. Final Value of Variable After Performing Operations>
Topic: <Array + String >
Approach: <extract the index and check if it contain + or not>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].contains("+")) {
                sum+=1;
            }else{
                sum-=1;
            }
        }
        return sum;
    }
}
