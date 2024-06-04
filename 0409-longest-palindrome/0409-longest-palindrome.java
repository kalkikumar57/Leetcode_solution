class Solution {
    public int longestPalindrome(String s) {
     int[] count1 = new int[125];
        for(char ch:s.toCharArray())
            count1[ch]++;
        int res = 0;
        for(int i=0;i<125;i++){
            int val = count1[i];
            res=res+(val/2)*2;
            if(res%2==0 &&val%2==1)
                res++;
        }
        return res;
    }
}