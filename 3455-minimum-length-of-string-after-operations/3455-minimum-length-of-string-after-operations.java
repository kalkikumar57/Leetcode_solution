class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch,mp.getOrDefault(ch, 0) + 1
            );
        }
        int deleteCount = 0;
        for (int frequency : mp.values()) {
            if (frequency % 2 == 1) {
                deleteCount += frequency - 1;
            } else {
                deleteCount += frequency - 2;
            }
        }
        return s.length() - deleteCount;
    }
}
