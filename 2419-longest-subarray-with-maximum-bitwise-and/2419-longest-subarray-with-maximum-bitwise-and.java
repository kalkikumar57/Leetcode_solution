class Solution {
    public int longestSubarray(int[] nums) {
        int maxValue=0;
        int maxResult=0;
        int Streak=0;
        
        for(int num:nums){
            if(num > maxValue){
                maxValue = num;
                maxResult=0;
                Streak=0;
            }
            if(maxValue == num){
                Streak++;
            }else{
                Streak=0;
            }
            maxResult = Math.max(maxResult,Streak);
        }
        return maxResult;
    }
}