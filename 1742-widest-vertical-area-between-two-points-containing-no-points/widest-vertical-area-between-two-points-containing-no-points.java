class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int arr[]=new int[points.length];
        for(int i=0;i<points.length;i++){
          
                arr[i]=points[i][0];
          
        }
        Arrays.sort(arr);
        int diff=0;
           for(int i=0;i<points.length-1;i++){
               int v=arr[i+1]-arr[i];
                if(diff<v){
                    diff=v;
                }
          
        }
       
        return diff;
    }
}