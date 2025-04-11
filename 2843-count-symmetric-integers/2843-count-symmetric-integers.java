class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;

        for(int i=low;i<=high;i++){
        String s=Integer.toString(i);
        int len = s.length();

        if(len % 2 != 0){
            continue;
        }
        int leftSum=0;
        int rightSum=0;

        for(int j=0;j<len/2;j++){
            leftSum += s.charAt(j)-'0';
        }
        for(int j=len/2;j<len;j++){
           rightSum += s.charAt(j)-'0';
        }

        if(leftSum == rightSum){
            count++;
        }
        }
        return count;
    }
}