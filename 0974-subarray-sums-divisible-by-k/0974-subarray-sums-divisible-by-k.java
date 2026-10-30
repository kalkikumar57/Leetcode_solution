class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum=0;
        int count=0;

        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int rem=prefixSum%k;
            rem=(rem+k)%k;  //To handle negative remainder
            count+=mp.getOrDefault(rem,0);
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return count;
    }
}