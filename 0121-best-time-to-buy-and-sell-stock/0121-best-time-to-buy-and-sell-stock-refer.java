class Solution {
    public int maxProfit(int[] prices) {
        int profix = 0;
        int minPrice = prices[0];

        for (int p : prices) {
            minPrice = Math.min(p, minPrice);
            profix = Math.max(profix, p - minPrice);
        }

        return profix;
    }
}