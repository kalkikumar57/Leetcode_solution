class Solution {
      public int numTrees(int n) {

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
    
        //calculate dp starting with 2 nodes
        for (int nodes = 2; nodes <= n; nodes++){
            for (int leftsub = 0; leftsub < nodes; leftsub ++){
                dp[nodes] += dp[leftsub]*dp[nodes-leftsub - 1];
            }
        }
        return dp[n];
        



    
    }
}
