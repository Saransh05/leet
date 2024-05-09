import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> pse = new Stack<>();
        Stack<Integer> nse = new Stack<>();
        int n = arr.length;
        int[] ps = new int[n];
        int[] ns = new int[n];
        int ans = 0;

        // Finding previous smaller element indices
        for (int i = 0; i < n; i++) {
            while (!pse.isEmpty() && arr[pse.peek()] > arr[i]) {
                pse.pop();
            }
            ps[i] = pse.isEmpty() ? -1 : pse.peek();
            pse.push(i);
        }

        // Finding next smaller element indices
        for (int i = n - 1; i >= 0; i--) {
            while (!nse.isEmpty() && arr[nse.peek()] >= arr[i]) {
                nse.pop();
            }
            ns[i] = nse.isEmpty() ? n : nse.peek();
            nse.push(i);
        }

        // Calculate the sum based on the previous and next smaller elements
        for (int i = 0; i < n; i++) {
            long g1 = (i - ps[i]);
            long g2 = (ns[i] - i);
            ans = (int) ((ans + arr[i] * g1 * g2) % 1000000007);
        }

        return ans;
    }
}
