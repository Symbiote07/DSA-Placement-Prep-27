class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array to optimize binary search range
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int halfLength = (totalLength + 1) / 2;

        int low = 0;
        int high = m;

        while (low <= high) {
            // Partition index for nums1
            int i = (low + high) / 2;
            // Partition index for nums2
            int j = halfLength - i;

            // Handle edge elements near partitions
            int left1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int right1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int left2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int right2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Check if we found the correct partition
            if (left1 <= right2 && left2 <= right1) {
                // Odd total elements: median is the maximum of the left halves
                if (totalLength % 2 != 0) {
                    return Math.max(left1, left2);
                }
                // Even total elements: median is the average of the two middle elements
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            } 
            // We partitioned too far right in nums1, shift left
            else if (left1 > right2) {
                high = i - 1;
            } 
            // We partitioned too far left in nums1, shift right
            else {
                low = i + 1;
            }
        }

        return 0.0; // Fallback value (never reached if arrays are sorted)
    }
}
