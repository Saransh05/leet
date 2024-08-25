class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int i = 0, j = 0;  // Two pointers for the sliding window
        int c = 0;  // Count of zeros in the current window
        int n = nums.length;

        while (j < n) {  // Iterate through the array with the right pointer `j`
            if (nums[j] == 0) {
                c++;  // Increment the zero count when a zero is found
            }
            
            // Check if the zero count exceeds `k`
            while (c > k) {
                if (nums[i] == 0) {
                    c--;  // Reduce the zero count as we move the left pointer `i`
                }
                i++;  // Move the left pointer to the right to shrink the window
            }

            // Calculate the current length and update the maximum length found
            ans = Math.max(ans, j - i + 1);
            
            // Move the right pointer to the next position
            j++;
        }

        return ans;  // Return the maximum length found
    }
}
