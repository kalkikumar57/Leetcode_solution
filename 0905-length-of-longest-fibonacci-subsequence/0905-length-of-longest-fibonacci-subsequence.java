class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int[][] t = new int[n][n];
        for (int[] row : t) Arrays.fill(row, -1);
        
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], i);
        }
        
        int max_length = 0;
        for (int j = 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int length = solve(j, k, arr, mp, t);
                if (length >= 3) {
                    max_length = Math.max(max_length, length);
                }
            }
        }
        return max_length >= 3 ? max_length : 0;
    }
    
    private int solve(int j, int k, int[] arr, Map<Integer, Integer> mp, int[][] t) {
        if (t[j][k] != -1) return t[j][k];
        
        int target = arr[k] - arr[j];
        if (mp.containsKey(target) && mp.get(target) < j) {
            int i = mp.get(target);
            t[j][k] = solve(i, j, arr, mp, t) + 1;
            return t[j][k];
        }
        
        return t[j][k] = 2;
    }
}