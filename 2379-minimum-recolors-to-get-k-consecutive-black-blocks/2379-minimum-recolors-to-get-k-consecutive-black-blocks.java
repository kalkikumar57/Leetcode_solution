class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int result = k;

        for (int i = 0; i <= n - k; i++) {
            int x = 0;
            for (int j = i; j - i + 1 <= k; j++) {
                if (blocks.charAt(j) == 'W') {
                    x++;
                }
            }
            result = Math.min(result, x);
        }

        return result;
    }
}