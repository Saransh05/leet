class Solution {
    public String[] findRelativeRanks(int[] score) {
         int n = score.length;
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) -> score[b] - score[a]);

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) result[indexes[i]] = "Gold Medal";
            else if (i == 1) result[indexes[i]] = "Silver Medal";
            else if (i == 2) result[indexes[i]] = "Bronze Medal";
            else result[indexes[i]] = String.valueOf(i + 1);
        }

        return result;
    }
}