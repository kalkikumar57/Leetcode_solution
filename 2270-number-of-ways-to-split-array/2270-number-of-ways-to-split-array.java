class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int num:nums){
            sum += num;
        }
        long leftSum=0;
        long rightSum=0;
        int split=0;

        for(int i=0;i<nums.length-1;i++){
            leftSum += nums[i];
            rightSum = sum - leftSum;

            if(leftSum >= rightSum){
                split++;
            }
        }
        return split;
    }
}