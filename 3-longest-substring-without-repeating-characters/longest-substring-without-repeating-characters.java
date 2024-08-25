class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        HashSet<Character> h = new HashSet<>();
        int i = 0, j = 0;
        
        while (i < n && j < n) {
            if (!h.contains(s.charAt(j))) {
                h.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                h.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}

