class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroCount=0;
        int left=0;

        for(int right=0;right<n;right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            if(zeroCount>k){
                if(nums[left]==0){   
                    zeroCount--;
                }
                left++;           //we increment left for every time 
            }
        }
        return n-left;    //like r-l here r is out of index so 
    }
}