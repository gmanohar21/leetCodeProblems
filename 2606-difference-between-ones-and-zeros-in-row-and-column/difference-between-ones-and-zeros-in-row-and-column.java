class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Arrays to store the counts of ones and zeros in each row and column
        int[] rowMatter = new int[m];
        int[] colMatter = new int[n];

        // Calculate the count of ones and zeros for each row
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else {
                    count--;
                }
            }
            rowMatter[i] = count;
        }

        // Calculate the count of ones and zeros for each column
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1) {
                    count++;
                } else {
                    count--;
                }
            }
            colMatter[i] = count;
        }

        // Create the difference matrix by combining row and column counts
        int[][] difference = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                difference[i][j] = rowMatter[i] + colMatter[j];
            }
        }

        return difference;
    }
}