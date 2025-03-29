import java.util.*;

class Solution {
    final int MOD = 1000000007;

    public int maximumScore(List<Integer> values, int ops) {
        int size = values.size();
        List<Integer> primeFactors = new ArrayList<>(Collections.nCopies(size, 0));

        for (int i = 0; i < size; i++) {
            int num = values.get(i);
            for (int factor = 2; factor <= Math.sqrt(num); factor++) {
                if (num % factor == 0) {
                    primeFactors.set(i, primeFactors.get(i) + 1);
                    while (num % factor == 0) num /= factor;
                }
            }
            if (num >= 2) primeFactors.set(i, primeFactors.get(i) + 1);
        }

        int[] nextGreater = new int[size];
        int[] prevGreater = new int[size];
        Arrays.fill(nextGreater, size);
        Arrays.fill(prevGreater, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && primeFactors.get(stack.peek()) < primeFactors.get(i)) {
                int topIdx = stack.pop();
                nextGreater[topIdx] = i;
            }
            if (!stack.isEmpty()) prevGreater[i] = stack.peek();
            stack.push(i);
        }

        long[] subarrayCount = new long[size];
        for (int i = 0; i < size; i++) {
            subarrayCount[i] = ((long) nextGreater[i] - i) * (i - prevGreater[i]);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (b[0] == a[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(b[0], a[0]);
        });

        for (int i = 0; i < size; i++) {
            maxHeap.offer(new int[] { values.get(i), i });
        }

        long result = 1;
        while (ops > 0) {
            int[] top = maxHeap.poll();
            int num = top[0];
            int idx = top[1];
            long count = Math.min((long) ops, subarrayCount[idx]);
            result = (result * modPower(num, count)) % MOD;
            ops -= count;
        }
        return (int) result;
    }

    private long modPower(long base, long exp) {
        long res = 1;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }
}
