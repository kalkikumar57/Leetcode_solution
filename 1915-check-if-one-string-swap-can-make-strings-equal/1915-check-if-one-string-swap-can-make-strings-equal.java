class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();

        int diff=0,firstidx=0,secondidx=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
            diff++;
            if(diff > 2){
                return false;
            }else if(diff == 1){
               firstidx=i;
            }else{
                secondidx=i;
            }
            } 
        }
        return s1.charAt(firstidx) == s2.charAt(secondidx) && s1.charAt(secondidx) == s2.charAt(firstidx);
    }
}