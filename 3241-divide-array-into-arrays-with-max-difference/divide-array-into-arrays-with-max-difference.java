class Solution {
    public int[][] divideArray(int[] m, int k) {
    	Arrays.sort(m);
        int l=m.length/3;
        int ans[][]=new int[l][3];
        int x=0;
        for(int i=0;i<m.length;i+=3){
          if(m[i+2]-m[i]<=k){
              ans[x][0]=m[i];
              ans[x][1]=m[i+1];
              ans[x][2]=m[i+2];
          }else{
              return new int[0][0];
          }
          x++;
        }
        return ans;
	}
}