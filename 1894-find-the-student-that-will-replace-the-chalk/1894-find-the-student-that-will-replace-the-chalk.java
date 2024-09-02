class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        long totalChalkSum =0;
        for(int chalkReq : chalk){
            totalChalkSum += chalkReq;
        }
        int remainingChalk = (int)(k%totalChalkSum);
        
        for(int i=0;i<n;i++){
            if(remainingChalk < chalk[i]){
                return i;
            }
            remainingChalk -=chalk[i];
        }
        return -1;
    }
}