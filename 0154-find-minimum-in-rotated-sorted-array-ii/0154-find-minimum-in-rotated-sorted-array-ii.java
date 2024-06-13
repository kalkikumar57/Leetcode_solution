// class Solution {
//     public int findMin(int[] nums) {
//         int max=nums[0];
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] < max){
//                 max = nums[i];
//             }
//         }
//         return max;
//     }
// }

class Solution{
 public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
       while(low < high){
           int mid = low +(high-low)/2;
           if(nums[low] > nums [mid]){
               high=mid;
               low++;
           }else if(nums[high] < nums[mid]){
               low = mid+1;
           }else{
               high--;
           }
       }
     return nums[low];
    }
}

 