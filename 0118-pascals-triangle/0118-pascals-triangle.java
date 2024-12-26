class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            List<Integer> ansRow = new ArrayList<>();
            long val = 1;
            ansRow.add(1); 

            for (int col = 1; col < row; col++) {
                val = val * (row - col);
                val = val / col;
                ansRow.add((int) val);
            }
            
            ans.add(ansRow);
        }
        
        return ans;
    }
}
