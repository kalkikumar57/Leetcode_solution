class Solution {
    public int maxChunksToSorted(int[] arr) {
      int maxx = 0;
      int count= 0;
      for(int i=0;i<arr.length;i++){
          maxx = Math.max(arr[i],maxx);
          if(i == maxx){
              count++;
          }
      }
        return count;
}
}