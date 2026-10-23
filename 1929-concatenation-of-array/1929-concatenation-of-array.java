class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        int n2 = ans.length;

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        for (int i = n; i < n2; i++) {
            ans[i] = nums[i - n];
        }
        return ans;
    }

}