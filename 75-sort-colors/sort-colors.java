class Solution {
    public static void swap(int []nums,int l,int r){
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
    }

    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1,mid=0;
        while(mid<=r){
            switch(nums[mid]){
                case 0:
                    swap(nums,mid,l);
                    l++;
                    mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                    swap(nums,mid,r);
                   
                    r--;
                break;
            }
        }
    }

}