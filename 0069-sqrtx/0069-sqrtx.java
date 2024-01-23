class Solution {
    public static int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        long left = 0;
        long right = x;

        while (left <= right) {
            long middle = (left + right) >>> 1;
            long value = middle * middle;
            if (x < value) {
                right = middle;
            } else if (right == middle || left == middle) {
                return (int) middle;
            } else {
                left = middle;
            }
        }
        return 0;
    }
}