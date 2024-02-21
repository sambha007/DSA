class Solution {
    public int firstUniqChar(String s) {
          int[] frequency = new int[26]; // Assuming the input string contains only lowercase English letters

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        // Find the index of the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found

        
    }
}