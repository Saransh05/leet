class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length, result = (1 << (n - 1)) * m;
        for (int j = 1; j < n; ++j) {
            int count = 0;
            for (int i = 0; i < m; ++i) {
                if (grid[i][j] == grid[i][0])
                    count += 1;
                else
                    count += 0;
            }
            result += Math.max(count, m - count) * (1 << (n - 1 - j));
        }
        return result;
    }
}