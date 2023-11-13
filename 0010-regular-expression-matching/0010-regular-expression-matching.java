class Solution {
    public boolean isMatch(String s, String p) {
        Boolean dp[][] = new Boolean[s.length() + 1][p.length() + 1];
        return helper(s, 0, p, 0, dp);
    }

    public static boolean helper(String s, int i, String p, int j, Boolean dp[][]){
        if(i == s.length() && j == p.length()) return true;
																		
        if(j == p.length()) return false;
        if(dp[i][j] != null) return dp[i][j]; 
        boolean ans = false;
        boolean charMatch = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if(j + 1 < p.length() && p.charAt(j + 1) == '*'){
            
            ans = helper(s, i, p, j + 2, dp) || charMatch && helper(s, i + 1, p, j, dp);
        }
        else ans = charMatch && helper(s, i + 1, p, j + 1, dp);
        return dp[i][j] = ans;
    }
}