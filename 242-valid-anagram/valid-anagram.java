import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract frequency based on characters in t
        for(char c : t.toCharArray()) {
            if(!map.containsKey(c)) {
                return false; // Character in t not in s
            }
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }
}
