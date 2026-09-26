class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element to the window
            sum += nums[right];

            // Increase its frequency
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // If window size becomes greater than k
            if (right - left + 1 > k) {

                sum -= nums[left];

                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // Window has exactly k elements
            if (right - left + 1 == k) {

                // Number of different elements == k
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }
}
