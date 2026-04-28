class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr); 

        int n = arr.length;

        int closestSum = 0;
        int minDiff = Integer.MAX_VALUE; 


        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

   
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(sum - target);

                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum == target) {
                    return sum;
                }
                else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}

