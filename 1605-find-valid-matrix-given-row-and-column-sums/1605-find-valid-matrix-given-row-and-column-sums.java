class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m=rowSum.length;
        int n=colSum.length;
        
        int[][] ResultMatrix = new int[m][n];
        
        int j=0,k=0;
        while(j<m && k<n){
            ResultMatrix[j][k] =Math.min(rowSum[j],colSum[k]);
            
            rowSum[j] = rowSum[j]-ResultMatrix[j][k];
            colSum[k] = colSum[k]-ResultMatrix[j][k]; 
            
            if(rowSum[j] == 0){
                j++;
            }
            if(colSum[k] == 0){
                k++;
            }
        }
        return ResultMatrix;
    }
}