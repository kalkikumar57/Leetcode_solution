import java.util.*;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                l1.add(num);
            } else {
                l2.add(num);
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans.addAll(l1);

        for (int num : l2) {
            if (num == pivot) {
                ans.add(num);
            }
        }
        for (int num : l2) {
            if (num != pivot) {
                ans.add(num);
            }
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
