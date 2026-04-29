class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if (k <= 1) return 0;

        int Count = 0;
        int product = 1;

        for (int left = 0, right = 0; right < nums.length; right++) {
           
            product = product * nums[right];

           
            while (product >= k) {
               
                product =product / nums[left++];
            }

           
            Count =Count+ right - left + 1;   
        }

        return Count;
    }
}