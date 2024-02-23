class Solution {
    long find(String num, long [] dp, int ones[]){
        if(dp[num.length()]!=-1){
            return dp[num.length()];
        }
        // long val = 0;
        long next = find(num.substring(1,num.length()),dp,ones);
        long val = 0;
        if(num.charAt(0)=='0'){
            val += next;
            dp[num.length()] = val;
            return val;
        } else{
            val += (num.charAt(0)-'0')*ones[num.length()-1] +next ;
        }
        if(num.charAt(0)!='1'){
            val+= Math.pow(10,num.length()-1);
        }else{
            val += Integer.parseInt(num.substring(1))+1;
        }
        dp[num.length()] = val;
        return val;
    }
    public int countDigitOne(int n) {
        String s = String.valueOf(n);
        long dp [] = new long [s.length()+2];
        int [] ones = new int[s.length()+1];
        ones[1] = 1;
        for(int i=2;i<ones.length;i++){
            ones[i] = 10*ones[i-1] + (int)Math.pow(10,i-1);
        }
        for(int i=2;i<dp.length;i++){
            dp[i] = -1;
        }
        dp[1] = (n%10)==0?0:1;
    find(s,dp,ones);
    return (int)dp[s.length()];
    }
}