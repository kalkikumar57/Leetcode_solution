class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int[] res = new int[n-k+1];

        int index=0;
        for(int right=0;right<n;right++){
           //remove expired indices
            while(!dq.isEmpty() && dq.peekFirst() <= right-k){
                dq.pollFirst();
            }
           
           //remove smaller elements from back
            while(!dq.isEmpty() && nums[dq.peekLast()] <nums[right]){
                dq.pollLast();
            }
            
            //add current index
            dq.offerLast(right);
            
            //window formed
            if(right>=k-1){
                res[index++] = nums[dq.peekFirst()];
            }

        }
        return res;
    }
}