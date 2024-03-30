class Solution {
    public void setZeroes(int[][] matrix) {
         int mark = Integer.MIN_VALUE; 
         boolean b[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){
                        // matrix[k][j]=-1;
                        b[k][j]=true;
                    }
                    for(int l=0;l<matrix[0].length;l++){
                        if( matrix[i][l]!=0)
                        // matrix[i][l]=-1;
                        b[i][l]=true;
                    }
                }
            }
        }
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            //    if(matrix[i][j]==b) matrix[i][j]=0; 
            if(b[i][j]==true) matrix[i][j]=0; 
            // System.out.print(matrix[i][j]+" ");
            }
          }

    }
}