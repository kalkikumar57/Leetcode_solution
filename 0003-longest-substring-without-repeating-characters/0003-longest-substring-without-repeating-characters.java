class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int l=0;
        int maxlength=Integer.MIN_VALUE;
        Set<Character> sets = new HashSet<>();
        for(int r=0;r<s.length();r++){
            if(sets.contains(s.charAt(r))){
                while(l<r && sets.contains(s.charAt(r))){
                    sets.remove(s.charAt(l));
                    l++;
                }
            }
            sets.add(s.charAt(r));
            maxlength = Math.max(maxlength , r-l+1);
        }
        return maxlength;
    }
}