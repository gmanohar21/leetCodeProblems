class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
     
        while(l<=h){
               int mid=l+(h-l)/2;
            if(target==nums[mid]) return mid;
            if(target>nums[mid]){
                l=mid+1;
                
            }else if(target<nums[mid]){
                h=mid-1;
            }
        }
        return -1;
    }
}