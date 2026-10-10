import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Step 1: Sort the ice cream costs in ascending order
        Arrays.sort(costs);
        
        int iceCreamCount = 0;
        
        // Step 2: Buy the cheapest ice cream bars first (Greedy approach)
        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;       // Pay for the ice cream
                iceCreamCount++;     // Increment total count
            } else {
                // Since the array is sorted, all remaining ice creams 
                // will be even more expensive, so we stop here.
                break;
            }
        }
        
        return iceCreamCount;
    }
}
