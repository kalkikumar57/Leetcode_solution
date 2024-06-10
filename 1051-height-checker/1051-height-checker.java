class Solution {
    public int heightChecker(int[] heights) {
        int[] expected =heights.clone() ;
            Arrays.sort(expected);
        int n=heights.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(heights[i] != expected[i] ){
                cnt++;
            }
        }
        return cnt;
    }
}