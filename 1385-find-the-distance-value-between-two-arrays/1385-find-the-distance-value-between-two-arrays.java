class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        for(int i=0;i<n1;i++){
            int first = arr1[i];
            boolean flag =false;
        for(int j=0;j<n2;j++){
            int second =arr2[j];
            if(Math.abs(second-first) <= d){
                flag = true;
                break;
            }
        }
            if(flag == false){
                count++;
            }
        }
        return count;
    }
}