import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        generateSubsets(nums, 0, subset, result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<>(subset)); // Add the current subset to the result
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]); // Include the current element
            generateSubsets(nums, i + 1, subset, result); // Recur for the next index
            subset.remove(subset.size() - 1); // Backtrack (remove the last element to try a different subset)
        }
    }
}
