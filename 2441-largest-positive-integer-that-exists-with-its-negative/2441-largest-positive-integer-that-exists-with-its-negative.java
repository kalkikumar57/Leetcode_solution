// class Solution {
//     public int findMaxK(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=1;j<nums.length;j++){
//                 if(nums[i] == -nums[j] || -nums[i] == nums[j]){
//                     return -nums[i];
                    
//                 }
//             }
            
//         }
//         return -1;
//     }
// }

class Solution{
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        for(int i=0;i<nums.length;i++){
            if(Arrays.binarySearch(nums,-nums[i]) >= 0){
                max = Math.max(max,nums[i]);
            }
        }
        return max;
    }
}




