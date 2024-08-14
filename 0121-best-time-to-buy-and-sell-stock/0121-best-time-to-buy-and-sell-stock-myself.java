class Solution {
    public int maxProfit(int[] prices) {
        int minV = 10000000;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minV = Math.min(minV, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minV);
        }
        return maxProfit;
    }
}