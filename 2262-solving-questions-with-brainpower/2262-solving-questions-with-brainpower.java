class Solution {
    private int n;
    
    private long solve(int i, int[][] questions, long[] t) {
        if (i >= n)
            return 0;
        
        if (t[i] != -1)
            return t[i];
        
        long taken = questions[i][0] + solve(i + questions[i][1] + 1, questions, t);
        long notTaken = solve(i + 1, questions, t);
        
        return t[i] = Math.max(taken, notTaken);
    }
    
    public long mostPoints(int[][] questions) {
        n = questions.length;
        long[] t = new long[n + 1];
        Arrays.fill(t, -1);
        return solve(0, questions, t);
    }
}