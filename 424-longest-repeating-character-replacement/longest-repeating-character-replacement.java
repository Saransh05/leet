class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0, r = 0;
        int ans = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (r < n) {
            // Add the current character to the map and update maxFreq
            char currentChar = s.charAt(r);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(currentChar));
            
            // If the current window size minus the most frequent character count is greater than k,
            // shrink the window from the left
            while (r - l + 1 - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            
            // Update the answer with the size of the current valid window
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        
        return ans;
    }
}
