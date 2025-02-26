class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;

        int currentSum=nums[0];
        int maxSubSum=nums[0];

        for(int i=1;i<n;i++){
        currentSum= Math.max(nums[i] , currentSum+nums[i]);
        maxSubSum= Math.max(maxSubSum , currentSum);
        }
        
        currentSum=nums[0];
        int minSubSum=nums[0];
        for(int i=1;i<n;i++){
        currentSum= Math.min(nums[i] , currentSum+nums[i]);
        minSubSum= Math.min(minSubSum , currentSum);
        }
    
    return Math.max(maxSubSum ,Math.abs(minSubSum));
    }
}