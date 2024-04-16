class Solution {
    
    public static int sumBdy(int[] arr,int div){
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += Math.ceil((double)(arr[i])/(double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n>threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi = Math.max(nums[i],maxi);
        }
        int low=1;
        int high = maxi;
        while(low<= high){
            int mid = (low+high)/2;
            if(sumBdy(nums,mid) <= threshold){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}