/*
Problem: <121. Best Time to Buy and Sell Stock>
Topic: <Array>
Approach: <brute force just check all>
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int max= 0;
        for(int i =0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]>prices[i]){
                    max= Math.max(max, prices[j]-prices[i]);
                }
            }
        }
        return max;
    }
}

/*
Problem: <121. Best Time to Buy and Sell Stock>
Topic: <Array>
Approach: <which day to sell stock : find min all days and calculate profit daily>
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}
