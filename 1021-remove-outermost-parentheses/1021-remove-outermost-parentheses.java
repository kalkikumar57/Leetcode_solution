class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int depth=0;
        int startIndex=0;
        String result ="";

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='('){
               if(depth==0){
                startIndex=i;
               }
               depth++;
            }else{
               depth--;
            }
            if(depth == 0){
                result +=s.substring(startIndex+1,i);
            }
        }
        return result;
    }
}