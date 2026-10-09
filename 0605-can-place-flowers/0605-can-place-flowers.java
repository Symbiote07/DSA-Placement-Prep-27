class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers need to be placed, we are already done
        if (n <= 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check if the left plot is empty (or if we are at the very first plot)
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                
                // Check if the right plot is empty (or if we are at the very last plot)
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                // If both sides are clear, we can plant a flower here safely
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant the flower
                    n--;              // Decrement the remaining count

                    // Early exit optimization
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return n <= 0;
    }
}
