class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<Character> uniqueLetters = new HashSet<>();

        for (char ch : s.toCharArray()) {
            uniqueLetters.add(ch);
        }

        int result = 0;

        for (char letter : uniqueLetters) {

            int first_Idx = -1;
            int last_Idx = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == letter) {

                    if (first_Idx == -1) {
                        first_Idx = i;
                    }

                    last_Idx = i;

                }
            }

            Set<Character> set = new HashSet<>();
            for (int middle = first_Idx + 1; middle <= last_Idx - 1; middle++) {
                set.add(s.charAt(middle));
            }

            result += set.size();

        }

        return result;
    }
}