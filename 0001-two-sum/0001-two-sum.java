class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int search = target - nums[i];
            if(mp.containsKey(search)){
                return new int[]{mp.get(search),i};
            }else{
                mp.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}

