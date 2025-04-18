class Solution {
    public boolean canBeValid(String s, String locked) {
        int close=0,open=0,flip=0;
        if(s.length() % 2 != 0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i) == '0'){
                flip++;
            }else{
                if(s.charAt(i) == '('){
                    open++;
                }else{
                    close++;
                }
            }
            if(flip + open < close){
                return false;
            }
        }
        close=0;
        open=0;
        flip=0;
        for(int i=s.length()-1 ; i>=0 ;i--){
            if(locked.charAt(i) == '0'){
                flip++;
            }else{
                if(s.charAt(i) == '('){
                    open++;
                }else{
                    close++;
                }
            }
            if(flip + close < open){
                return false;
            }
        }
        return true;
    }
}