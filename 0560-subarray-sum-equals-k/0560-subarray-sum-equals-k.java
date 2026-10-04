class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        mp.put(0,1);

        int count=0;
        int prefixSum=0;

        for(int n:nums){
            prefixSum += n;

            if(mp.containsKey(prefixSum-k)){
                count+=mp.get(prefixSum-k);
            }
            mp.put(prefixSum,mp.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}