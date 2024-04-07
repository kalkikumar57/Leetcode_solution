class Solution {
    public int search(int[] nums, int target) {
        return BS(nums,target);
    }
    public static int LS(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;        }
        }
        return -1;
    }
    public static int BS(int[] nums,int target){
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[s]<=nums[mid]){
                if(nums[s]<=target && nums[mid]>=target)
                        e=mid-1;
                
                else
                    s=mid+1;
            }
            else{
                if(nums[mid]<=target && nums[e]>=target)
                    s=mid+1;
                else
                    e=mid-1;
            }
        }
        return -1;
    }
}