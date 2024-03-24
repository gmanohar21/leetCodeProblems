class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=nums[0];
        for(int a:nums){
           sum+= a;
           maxi=Math.max(sum,maxi);
           if(sum<0) sum=0;
        }
        return maxi;
    }
}
