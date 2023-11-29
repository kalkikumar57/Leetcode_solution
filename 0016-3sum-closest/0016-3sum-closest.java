import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sorting given list
        Arrays.sort(nums);

        // Initializing closestsum variable to a large integer
        int closestsum = Integer.MAX_VALUE;

        // Traversing through the whole list
        for (int i = 0; i < nums.length - 2; i++) {
            // Defining Pointers left and right to get closestsum
            int left = i + 1, right = nums.length - 1;

            // Traversing through remaining elements of list for each i value
            while (left < right) {
                // Defining currentsum which will be used to compare with closestsum
                int currentsum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentsum - target) < Math.abs(closestsum - target)) {
                    closestsum = currentsum; // Assigning closest value to closestsum each time
                }

                if (currentsum < target) {
                    left++; // If closest sum is less than we need to add a higher element so move left pointer
                } else {
                    right--; // If closest sum is higher than we need to remove a higher element so move right pointer
                }
            }
        }
        return closestsum;
    }
}
