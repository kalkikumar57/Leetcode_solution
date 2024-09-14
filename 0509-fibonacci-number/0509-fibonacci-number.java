// Rec+Memo
// class Solution {
//     private int solve(int n, int[] dp){
//         if(n < 2) return n;
//         if(dp[n] != 0)
//             return dp[n];
//         int ans = solve(n-1,dp) + solve(n-2,dp);
//         return dp[n] = ans;
//     }
//     public int fib(int n) {
//         int[] dp = new int[n+1];
//         return solve(n,dp);
//     }
// }

// Bottom up:
//  class Solution {
//     public int fib(int n) {
//         if(n<2) return n;
//         int[] t = new int[n+1];
//         t[0]=0;
//         t[1]=1;
//         for(int i=2; i<n+1; i++){
//             t[i]=t[i-1]+t[i-2];
//         }
//         return t[n];
//     }
// }

// Space Optimised:  
class Solution {
    public int fib(int n) {
        
        if(n<2) return n;
        int a=0, b=1, c=0;
        
        for(int i=1; i<n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}