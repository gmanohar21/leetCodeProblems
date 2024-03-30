class Solution {
    public void setZeroes(int[][] matrix) {
         int mark = Integer.MIN_VALUE; 
         boolean b[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){
                        b[k][j]=true;
                    }
                    for(int l=0;l<matrix[0].length;l++){
                        if( matrix[i][l]!=0)
                        b[i][l]=true;
                    }
                }
            }
        }
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            if(b[i][j]==true) matrix[i][j]=0; 
            }
          }

    }
}