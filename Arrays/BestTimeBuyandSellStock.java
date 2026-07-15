/*
Problem: <121. Best Time to Buy and Sell Stock>
Topic: <Array>
Approach: <brute force just check all - limit exceed for big cases>
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
        int i=0;
        int k=1;
        int profit =0;
        while(k<prices.length && i<prices.length){
            if(prices[i]<prices[k]){
                profit = Math.max(profit, prices[k]-prices[i]);
            }
            else {
                i = k; // min se change
            }
            k++;
        }
        return profit;
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
        int min = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}
