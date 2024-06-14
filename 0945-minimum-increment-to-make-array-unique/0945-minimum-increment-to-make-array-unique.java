class Solution {
  public int minIncrementForUnique(int[] nums) {
    Arrays.sort(nums);
    int i = 0;
    int count = 0;

    for (int n : nums) {
      i = Math.max(i, n);

      count += i++ - n;
    }
    return count;
  }
}