import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Edge case: If the array is empty or window size is 0
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;

        // Deque will store indices of elements, ordered decreasingly by their values
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Step 1: Remove indices that are outside the boundaries of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Step 2: Maintain monotonic decreasing property
            // Remove all elements from the back that are smaller than the current element nums[i]
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Step 3: Add the current element's index to the back of the deque
            deque.offerLast(i);

            // Step 4: Once the window reaches size k, the front of the deque is the maximum
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
