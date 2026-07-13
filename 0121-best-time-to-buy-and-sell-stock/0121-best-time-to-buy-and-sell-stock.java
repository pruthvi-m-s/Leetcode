class Solution {
    public int maxProfit(int[] prices) {
        int minP=prices[0];
        int maxP=0;
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-minP;
            minP=Math.min(minP,prices[i]);
            maxP=Math.max(maxP,profit);
        }
        return maxP;
    }
}