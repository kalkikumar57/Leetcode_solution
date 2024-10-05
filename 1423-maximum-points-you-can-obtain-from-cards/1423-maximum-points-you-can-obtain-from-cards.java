class Solution {
    public int maxScore(int[] arr, int k) {
        int leftSum=0,rightSum=0,maxSum=0;
        for(int i=0;i<k;i++){
            leftSum=leftSum+arr[i];
    }
        maxSum=leftSum;
        int right=arr.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum=leftSum-arr[i];
            rightSum=rightSum+arr[right];
            right=right-1;
            maxSum=Math.max(maxSum,leftSum+rightSum);           
        }
        return maxSum;
    }
}