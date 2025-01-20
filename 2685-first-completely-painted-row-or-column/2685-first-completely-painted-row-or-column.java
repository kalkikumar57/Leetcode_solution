class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);
        }
        int MinIndex =Integer.MAX_VALUE;
        for(int row=0;row<m;row++){
            int lastIndex = Integer.MIN_VALUE;

            for(int col=0;col<n;col++){
                int value = mat[row][col];
                int idx=mp.get(value);
                lastIndex=Math.max(lastIndex , idx);
            }
            MinIndex=Math.min(lastIndex,MinIndex);
        }

        for(int col=0;col<n;col++){
            int lastIndex = Integer.MIN_VALUE;

            for(int row=0;row<m;row++){
                int value = mat[row][col];
                int idx=mp.get(value);
                lastIndex=Math.max(lastIndex , idx);
            }
            MinIndex=Math.min(lastIndex,MinIndex);
        }
        return MinIndex;
    }
}