class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        
        int[] rightMax = new int[n];
        int maxVal = nums[n - 1]; 
        for (int i = n - 2; i > 0; --i) {
            rightMax[i] = maxVal;
            maxVal = Math.max(maxVal, nums[i]);
        }

        
        long maxTriplet = 0;
        maxVal = nums[0];
        for (int i = 1; i < n - 1; ++i) {
            maxTriplet = Math.max(maxTriplet, (long)(maxVal - nums[i]) * rightMax[i]);
            maxVal = Math.max(maxVal, nums[i]);
        }
        return maxTriplet;
    }
}