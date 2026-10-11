class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate the prefix products and store them in the result array
        // 'result[i]' will store the product of all elements to the left of 'i'
        result[0] = 1; // No elements to the left of index 0
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix products on the fly and multiply them into the result
        // 'rightProduct' tracks the product of all elements to the right of 'i'
        int rightProduct = 1; 
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct; // Multiply left product by right product
            rightProduct *= nums[i];              // Update the right product tracker
        }

        return result;
    }
}
