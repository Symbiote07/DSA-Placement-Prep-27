class Solution {
    public int maxProfit(int[] prices) {
        // Edge case: If there are fewer than 2 days, no transaction can be made
        if (prices == null || prices.length < 2) {
            return 0;
        }

        // Initialize tracking variables
        int minPrice = prices[0]; // Track the absolute lowest price seen so far
        int maxProfit = 0;        // Track the maximum profit achievable

        // Loop through the prices starting from the second day
        for (int i = 1; i < prices.length; i++) {
            // Update the minimum buying price if a cheaper day is found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate potential profit if sold today and update max profit
            else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
