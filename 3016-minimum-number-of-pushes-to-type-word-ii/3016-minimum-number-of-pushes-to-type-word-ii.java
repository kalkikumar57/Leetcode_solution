class Solution {
    public int minimumPushes(String word) {
        int[] mpp = new int[26];
        for(char ch: word.toCharArray()){
            mpp[ch-'a'] += 1;
        }
        Integer[] mpInteger = new Integer[26];
        for(int i=0;i<26;i++){
            mpInteger[i] = mpp[i]; 
        }
        Arrays.sort(mpInteger,(a,b)->b-a);
        
        int ans=0;
        for(int i=0;i<26;i++){
            ans = ans + mpInteger[i] * ((i/8)+1);
        }
        return ans;
    }
}