class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] rmin = new int[arr.length+1];
        
        rmin[arr.length] = Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rmin[i] = Math.min(rmin[i+1],arr[i]);
        }
        
        int leftMax = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            leftMax = Math.max(arr[i],leftMax);
            if(leftMax <= rmin[i+1]){
                count++;
            }
        }
        return count;
    }
}