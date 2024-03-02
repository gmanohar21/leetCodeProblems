class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
       int c=0;
       for(int i:nums){
           ans[c++]=i*i;
       }
       Arrays.sort(ans);
       return ans;
    }
}