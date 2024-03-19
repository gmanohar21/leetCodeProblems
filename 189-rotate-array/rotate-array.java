class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1); //for rev entire array
        reverse(nums,0,k-1); //for rev first half after rev
        reverse(nums,k,nums.length-1); //for rev second half
    }
    public void reverse(int []nums,int l,int r){
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;r--;
        }
    }
}