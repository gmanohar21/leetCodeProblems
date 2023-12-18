class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
       int sm= nums[0]*nums[1];
       int lg=nums[nums.length-2]*nums[nums.length-1];
       int temp=lg-sm;
       return temp;
    }
}