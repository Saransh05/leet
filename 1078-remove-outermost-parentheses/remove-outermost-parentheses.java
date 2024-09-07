class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0; // Keeps track of the number of open parentheses
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // If openCount > 0, it means we're inside an inner pair, so append the '('
                if (openCount > 0) {
                    result.append(c);
                }
                openCount++; // Increment the open parentheses count
            } else {
                openCount--; // Decrement the open parentheses count
                // If openCount > 0 after decrementing, it means we're inside an inner pair, so append the ')'
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }
        
        return result.toString();
    }
}
