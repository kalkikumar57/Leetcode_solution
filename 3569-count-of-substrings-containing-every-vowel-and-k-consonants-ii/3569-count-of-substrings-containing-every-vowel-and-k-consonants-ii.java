class Solution {
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public long countOfSubstrings(String word, int k) {
        int n = word.length();
        Map<Character, Integer> mp = new HashMap<>(); 
    
        int[] nextCons = new int[n];
        int lastConsIdx = n;
        for (int i = n - 1; i >= 0; i--) {
            nextCons[i] = lastConsIdx;
            if (!isVowel(word.charAt(i))) {
                lastConsIdx = i;
            }
        }
        
        int i = 0, j = 0;
        long count = 0;
        int cons = 0;
        
        while (j < n) {
            char ch = word.charAt(j);
            if (isVowel(ch)) {
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            } else {
                cons++;
            }
            
            while (cons > k) {
                char ci = word.charAt(i);
                if (isVowel(ci)) {
                    mp.put(ci, mp.get(ci) - 1);
                    if (mp.get(ci) == 0) {
                        mp.remove(ci);
                    }
                } else {
                    cons--;
                }
                i++;
            }
            
            while (i < n && mp.size() == 5 && cons == k) {
                int idx = nextCons[j];
                count += idx - j;
                
                char ci = word.charAt(i);
                if (isVowel(ci)) {
                    mp.put(ci, mp.get(ci) - 1);
                    if (mp.get(ci) == 0) {
                        mp.remove(ci);
                    }
                } else {
                    cons--;
                }
                i++;
            }
            
            j++;
        }
        
        return count;
    }
}