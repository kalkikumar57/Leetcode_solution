class Solution {
    public boolean isPalindrome(int x) {
        int revNum=0;
        int dummy=x;
        while(x>0){
            int digit = x%10;
            revNum = (revNum*10)+digit;
            x=x/10;
        }
        return dummy ==revNum;
    }
}