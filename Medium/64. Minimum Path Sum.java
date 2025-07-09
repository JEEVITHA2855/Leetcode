class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] minPath = new int[n]; 
        minPath[0] = grid[0][0];

        for (int j = 1; j < n; j++) {
            minPath[j] = minPath[j-1]+grid[0][j];
        }

        for (int i=1;i<m;i++) {
            minPath[0]+=grid[i][0];
            for (int j = 1; j < n; j++) {
                minPath[j] = grid[i][j] + Math.min(minPath[j], minPath[j - 1]);
            }
        }

        return minPath[n - 1];
    }
}
