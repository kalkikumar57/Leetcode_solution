class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            int s = ((-1) * nums[i]);
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (s == sum) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && right < n - 1 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }else if (sum < s) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;
    }
}