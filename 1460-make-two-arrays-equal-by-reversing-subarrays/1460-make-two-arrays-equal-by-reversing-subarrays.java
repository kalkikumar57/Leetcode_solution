class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int m = target.length;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<m;i++){
            if(target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}