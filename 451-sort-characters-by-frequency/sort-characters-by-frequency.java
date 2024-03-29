import java.util.*;

class Solution {
    public String frequencySort(String s) {
        int[] count = new int[256];
        StringBuilder str = new StringBuilder();
        Arrays.fill(count, 0);
        
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                for (int j = 0; j < count[i]; j++) {
                    charList.add((char)i);
                }
            }
        }
        
        charList.sort((a, b) -> count[b] - count[a]);
        
        for (char c : charList) {
            str.append(c);
        }
        
        return str.toString();
    }
}
