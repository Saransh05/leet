class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> h = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (h.contains(s.charAt(j))) {
                    ans = Math.max(ans, j - i);
                    break;
                }
                h.add(s.charAt(j));
            }
            // Update the ans after the inner loop to ensure the last substring is counted
            ans = Math.max(ans, h.size());
        }

        return ans;
    }
}
