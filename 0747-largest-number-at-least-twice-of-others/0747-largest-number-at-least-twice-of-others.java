class Solution {
    public int dominantIndex(int[] nums) {
    if(nums.length == 0){
        return -1;
    }
        int largest = Integer.MIN_VALUE;
        int largestIndex = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest){
                largest = nums[i];
                largestIndex = i;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(i != largestIndex && largest < 2 *nums[i]){
                return -1;
            }
        }
        return largestIndex;
    }
}