class Solution {
    private boolean isPossible(int[] nums, int mid, int k) {
        int house = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                house++;
                i++;
            }
        }
        return house >= k; 
    }

    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int l = nums[0], r = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < l) l = nums[i];
            if (nums[i] > r) r = nums[i];
        }
        int result = r;
        while (l <= r) { 
            int mid = l + (r - l) / 2;

            if (isPossible(nums, mid, k)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}
