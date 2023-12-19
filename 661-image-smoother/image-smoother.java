class Solution {
   public int[][] imageSmoother(int nums[][]) {
		int[][] result = new int[nums.length][nums[0].length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				result[i][j] = getAvgVal(nums, i, j, nums.length, nums[0].length);
			}
		}
		return result;
	}

	public static int getAvgVal(int nums[][], int ri, int cj, int row, int col) {
		int total = 0;
		int count = 0;
		int top = Math.max(0, ri - 1);
		int bottom = Math.min(row, ri + 2);
		int left = Math.max(0, cj - 1);
		int right = Math.min(col, cj + 2);

		for (int rows = top; rows < bottom; rows++) {
			for (int cols = left; cols < right; cols++) {
				total += nums[rows][cols];
				count += 1;
			}
		}
		return total / count;
	}
}