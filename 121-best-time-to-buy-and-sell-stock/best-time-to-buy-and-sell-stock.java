class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        
        int n=prices.length;
        int buy=Integer.MAX_VALUE;
        int profit=0;
        
        while(i<n){
            buy=Math.min(buy,prices[i]);
            profit=Math.max(profit,prices[i]-buy);
            i++;

        }
        return profit;

        
    }
}