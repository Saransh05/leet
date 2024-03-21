import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        backtrack(num, target, 0, "", 0, 0, result);
        return result;
    }

    private void backtrack(String num, int target, int index, String expr, long eval, long prevNum, List<String> result) {
        if (index == num.length()) {
            if (eval == target) {
                result.add(expr);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break; // Avoid leading zeros

            long currNum = Long.parseLong(num.substring(index, i + 1));

            if (index == 0) {
                backtrack(num, target, i + 1, expr + currNum, currNum, currNum, result);
            } else {
                backtrack(num, target, i + 1, expr + "+" + currNum, eval + currNum, currNum, result);
                backtrack(num, target, i + 1, expr + "-" + currNum, eval - currNum, -currNum, result);
                backtrack(num, target, i + 1, expr + "*" + currNum, eval - prevNum + prevNum * currNum, prevNum * currNum, result);
            }
        }
    }
}