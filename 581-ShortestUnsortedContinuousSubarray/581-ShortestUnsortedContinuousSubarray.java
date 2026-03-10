// Last updated: 3/10/2026, 3:14:27 PM
class Solution {
    public int findUnsortedSubarray(int[] nums) {
    int n = nums.length;
    int left = 0, right = n - 1;

    
    while (left < n - 1 && nums[left] <= nums[left + 1]) {
        left++;
    }

    
    if (left == n - 1) return 0;

    
    while (right > 0 && nums[right] >= nums[right - 1]) {
        right--;
    }

    
    int subMin = Integer.MAX_VALUE;
    int subMax = Integer.MIN_VALUE;
    for (int i = left; i <= right; i++) {
        subMin = Math.min(subMin, nums[i]);
        subMax = Math.max(subMax, nums[i]);
    }

    
    while (left > 0 && nums[left - 1] > subMin) {
        left--;
    }

    
    while (right < n - 1 && nums[right + 1] < subMax) {
        right++;
    }

    return right - left + 1;
}
}