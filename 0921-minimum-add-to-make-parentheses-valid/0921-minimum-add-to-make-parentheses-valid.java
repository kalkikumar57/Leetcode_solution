class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int depth=0;
        int ans=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='('){
                depth++;
            }else{
                if(depth>0){
                    depth--;
                }else{
                    ans++;
                }
            }
        }
        return ans+depth;
    }
}