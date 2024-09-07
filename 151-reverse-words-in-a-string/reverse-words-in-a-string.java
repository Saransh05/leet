class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int n = s.length();
        String str = "";
        String str1 = "";
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                if (!str1.isEmpty()) { // Only add non-empty words
                    str = str1 + " " + str; // Add the word to the result in reverse order
                    str1 = ""; // Reset the temporary word holder
                }
            } else {
                str1 += s.charAt(i); // Build the current word
            }
        }
        
        // Add the last word (since it won't be followed by a space)
        str = str1 + " " + str;
        str = str.trim(); // Remove the extra space at the end
        
        return str;
    }
}
