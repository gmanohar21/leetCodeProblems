class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
         int n =1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
               n*=nums[j];
                if(n<k) ans++;
                else break;
            }
            n=1;
        }
        return ans;
    }
}