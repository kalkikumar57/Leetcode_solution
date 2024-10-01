import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold the sorted string as key and list of anagrams as value
        Map<String, List<String>> mpp = new HashMap<>();
        for(String s : strs){
            // Convert the string to a character array
            char[] charArray = s.toCharArray();
            // Sort the character array
            Arrays.sort(charArray);
            // Create a new sorted string
            String sorted = new String(charArray);
            // If the sorted string is not already a key in the map, add it
            if(!mpp.containsKey(sorted)){
                mpp.put(sorted, new LinkedList<String>());
            }
            // Add the original string to the corresponding anagram list
            mpp.get(sorted).add(s);
        }
        // Return all the anagram groups as a list of lists
        return new LinkedList<>(mpp.values());
    }
}
