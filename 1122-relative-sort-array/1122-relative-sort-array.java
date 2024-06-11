class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Find the maximum value in arr1 to determine the size of the count array
        int length = 0;
        for (int i = 0; i < arr1.length; i++) {
            length = Math.max(length, arr1[i]);
        }
        
        // Create and populate the count array
        int[] count = new int[length + 1];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        
        // Create the result array
        int[] ans = new int[arr1.length];
        int index = 0;
        
        // Place the elements of arr2 in the result array in the specified order
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] > 0) {
                ans[index] = arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }
        
        // Place the remaining elements in the result array in ascending order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ans[index] = i;
                index++;
                count[i]--;
            }
        }
        
        return ans;
    }
}
