import java.util.Arrays;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = Arrays.stream(cardPoints).sum(); // Total sum of all card points
        if (k == n) return totalSum; // If k == n, return total sum

        int windowSize = n - k;
        int currentWindowSum = 0;
        
        // Calculate the sum of the first window (of size windowSize)
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += cardPoints[i];
        }

        // Initialize the minimum sum as the current window sum
        int minWindowSum = currentWindowSum;

        // Slide the window across the array
        for (int i = windowSize; i < n; i++) {
            currentWindowSum += cardPoints[i] - cardPoints[i - windowSize]; // Slide window
            minWindowSum = Math.min(minWindowSum, currentWindowSum); // Track minimum window sum
        }

        return totalSum - minWindowSum; // Max score is total sum minus minimum window sum
    }
}
