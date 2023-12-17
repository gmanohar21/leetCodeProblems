class Solution {
    public int[][] divideArray(int[] m, int k) {
    	Arrays.sort(m);
		int arr[][]=new int[m.length/3][3];
        int x=0;
        for(int i=0;i<m.length;i+=3){
            if(m[i+2]-m[i]<=k){
                arr[x][0]=m[i];
                arr[x][1]=m[i+1];
                arr[x][2]=m[i+2];

            }else{
                return new int[0][0];
            }
            x++;
        }
        return arr;
	}
}