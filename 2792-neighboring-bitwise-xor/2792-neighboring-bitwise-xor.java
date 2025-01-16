class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int[] arr = new int[n];
        arr[0]=0;
        for(int i=0;i<n-1;i++){
           arr[i+1] =arr[i] ^ derived[i]; 
        }
        if((arr[n-1] ^ arr[0]) == derived[n-1]){
            return true;
        }
        
        arr[0]=1;
        for(int i=0;i<n-1;i++){
            arr[i+1] =arr[i] ^ derived[i];
        }
        if((arr[n-1] ^ arr[0]) == derived[n-1]){
           return true;
        }
        return false;
    }
}