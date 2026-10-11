class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointer for the last valid element in nums1
        int p1 = m - 1;
        // Pointer for the last element in nums2
        int p2 = n - 1;
        // Pointer for the absolute end of the nums1 array (where the largest item goes)
        int pMerge = m + n - 1;

        // Loop as long as there are elements left to compare in both arrays
        while (p1 >= 0 && p2 >= 0) {
            // Compare elements from the back and place the larger one at the end
            if (nums1[p1] > nums2[p2]) {
                nums1[pMerge] = nums1[p1];
                p1--;
            } else {
                nums1[pMerge] = nums2[p2];
                p2--;
            }
            pMerge--;
        }

        // If nums2 still has elements left, copy them over
        // (If nums1 has elements left, they are already in their correct sorted positions)
        while (p2 >= 0) {
            nums1[pMerge] = nums2[p2];
            p2--;
            pMerge--;
        }
    }
}
