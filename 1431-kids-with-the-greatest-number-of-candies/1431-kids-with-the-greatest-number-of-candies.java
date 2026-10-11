import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the current maximum number of candies among all kids
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Initialize the result list
        List<Boolean> result = new ArrayList<>(candies.length);

        // Step 2: Check each kid's potential total against the maximum
        for (int candy : candies) {
            // If the kid's candies + extraCandies is >= maxCandies, add true
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
