class Solution {
    public int lengthOfLongestSubstring(String s) {
          Set<Character>uniq= new HashSet<>();
              int i=0,j=0,longestSubstringCount= 0;
while(j<s.length())
{
              if(!uniq.contains(s.charAt(j)))
              {
                  uniq.add(s.charAt(j++));
                  longestSubstringCount = Math.max(longestSubstringCount,uniq.size());
              }
              else{
                  uniq.remove(s.charAt(i++));
              }
    } 
     return longestSubstringCount; 
    }
}