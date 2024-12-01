class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i] * 2)) {
                return true;
            } 
            else if (arr[i] % 2 == 0 && set.contains(arr[i] / 2)) {
                return true;
            }
            set.add(arr[i]);
        }

        return false;
    }
}