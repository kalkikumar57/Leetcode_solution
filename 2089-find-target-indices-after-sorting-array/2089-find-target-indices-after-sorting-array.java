class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ls=new ArrayList<>();
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ls.add(count);
                count++;
            }
        }
        return ls;
    }
}