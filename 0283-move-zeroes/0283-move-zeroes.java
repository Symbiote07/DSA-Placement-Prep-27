class Solution {
    public void moveZeroes(int[] nums) {
        // The 'writePointer' tracks the position where the next non-zero element should go
        int writePointer = 0;

        // Loop through the array using 'readPointer'
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            // If we find a non-zero element, swap it with the element at 'writePointer'
            if (nums[readPointer] != 0) {
                // Perform the swap
                int temp = nums[readPointer];
                nums[readPointer] = nums[writePointer];
                nums[writePointer] = temp;

                // Move the write pointer to the next slot
                writePointer++;
            }
        }
    }
}
