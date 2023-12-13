class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]==1) {
					int sum=0;
					for(int k=0;k<mat[0].length;k++) {
						sum+=mat[i][k];
					}
					for(int l=0;l<mat.length;l++) {
						sum+=mat[l][j];
					}
					if(sum == 2) {
						count++;
					}
				}
			}
		}
        return count;
    }
}