class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        // Ensure nums1 is always the smaller array
        if (n > m) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int low = 0;
        int high = n;
        
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (n + m + 1) / 2 - partitionX;
            
            // Calculate the four elements around the partitions
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == n) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == m) ? Integer.MAX_VALUE : nums2[partitionY];
            
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // Found the correct partitions
                if ((n + m) % 2 == 0) {
                    // Even number of elements
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    // Odd number of elements
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // Move towards the left in nums1
                high = partitionX - 1;
            } else {
                // Move towards the right in nums1
                low = partitionX + 1;
            }
        }
        
        // Arrays are not sorted or input is invalid
        throw new IllegalArgumentException("Arrays are not sorted or invalid input.");
    }
}
