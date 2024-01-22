class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length,sum=0;
        int sumOfNums=l*(l+1)/2;
        for(int i:nums){
            sum+=i;    
        }
     
        return sumOfNums-sum;
    }
}