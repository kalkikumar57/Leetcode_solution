class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long score=0;
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
         ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        for(int i=n/2;i<n;i++){
            score+=ans[i];
        }
        for(int i=0;i<n/2;i++){
            score-=ans[i];
        }
        return score;
    }
}