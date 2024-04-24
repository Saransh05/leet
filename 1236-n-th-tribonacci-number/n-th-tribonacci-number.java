import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int result = tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1);
        memo.put(n, result);
        return result;
    }
}
