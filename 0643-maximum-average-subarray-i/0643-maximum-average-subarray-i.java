
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        long sum = 0;
        long maxSum = Long.MIN_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            if (right - left + 1 == k) {
                if (sum > maxSum) {
                    maxSum = sum;
                }

                sum -= nums[left];
                left++;
            }
        }

        return (double) maxSum / k;
    }
}
