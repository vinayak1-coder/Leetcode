class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid;
    while (l <= r) {
        mid = (r - l) / 2 + l;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            if (nums[mid] > nums[r] && nums[l] > target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        } else {
            if (nums[mid] < nums[l] && nums[l] <= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
    }
    return -1;
    }
}