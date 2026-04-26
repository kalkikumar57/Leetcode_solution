class Solution {
    public int[] sortedSquares(int[] nums) {
        int sqt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sqt=nums[i]*nums[i];
            nums[i]=sqt;    
        }
        Arrays.sort(nums);
        return nums;
    }
}