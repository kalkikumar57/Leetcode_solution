 class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();  
        // Add all allowed characters to the set
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int count = 0; // Initialize count of consistent strings
        // Iterate over each word in the words array
        for (String k : words) {
            boolean isConsistent = true; // Assume the word is consistent
            // Check each character of the word
            for (int i = 0; i < k.length(); i++) {
                if (!set.contains(k.charAt(i))) {
                    isConsistent = false; // If a character is not allowed, mark as inconsistent
                    break; // Stop checking this word
                }
            }
            // If the word is consistent, increment the count
            if (isConsistent) {
                count++;
            }
        }
        return count; // Return the count of consistent strings
    }
}
