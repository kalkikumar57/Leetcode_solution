

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        Deque<Integer> deq = new ArrayDeque<>();

        int[] result = new int[n - k + 1];
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            // Step 1: Remove elements which are outside the window
            while (!deq.isEmpty() && deq.peekFirst() <= i - k) {
                deq.pollFirst();
            }

            // Step 2: Remove smaller elements from the back
            while (!deq.isEmpty() && nums[i] >= nums[deq.peekLast()]) {
                deq.pollLast();
            }

            // Step 3: Add current index
            deq.offerLast(i);

            // Step 4: Store maximum when window size becomes k
            if (i >= k - 1) {
                result[resultIndex] = nums[deq.peekFirst()];
                resultIndex++;
            }
        }

        return result;
    }
}