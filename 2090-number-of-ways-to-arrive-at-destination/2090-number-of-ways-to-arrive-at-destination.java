class Solution {
    private static final int MOD = 1_000_000_007;

    static class Pair implements Comparable<Pair> {
        long time;
        int node;

        Pair(long time, int node) {
            this.time = time;
            this.node = node;
        }
        public int compareTo(Pair other) {
            return Long.compare(this.time, other.time);
        }
    }

    public int countPaths(int n, int[][] roads) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0], v = road[1], time = road[2];
            adj.get(u).add(new int[]{v, time});
            adj.get(v).add(new int[]{u, time});
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        long[] result = new long[n];
        int[] pathCount = new int[n];
        Arrays.fill(result, Long.MAX_VALUE);

        result[0] = 0;
        pathCount[0] = 1;
        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            long currTime = curr.time;
            int currNode = curr.node;

            if (currTime > result[currNode]) continue;

            for (int[] neighbor : adj.get(currNode)) {
                int adjNode = neighbor[0];
                int roadTime = neighbor[1];

                if (currTime + roadTime < result[adjNode]) {
                    result[adjNode] = currTime + roadTime;
                    pathCount[adjNode] = pathCount[currNode];
                    pq.offer(new Pair(result[adjNode], adjNode));
                } else if (currTime + roadTime == result[adjNode]) {
                    pathCount[adjNode] = (pathCount[adjNode] + pathCount[currNode]) % MOD;
                }
            }
        }

        return pathCount[n - 1];
    }
}
