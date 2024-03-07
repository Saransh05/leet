class Solution {
    public int myAtoi(String s) {
        int i = 0;
        String str = "";
        char sign = '+';

        // Skip leading whitespaces
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }

        // Check for sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i);
            i++;
        }

        // Build the string of digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            str += s.charAt(i);
            i++;
        }

        // Convert string to integer
        int result = 0;
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + digit;
        }

        return (sign == '-') ? -result : result;
    }
}
