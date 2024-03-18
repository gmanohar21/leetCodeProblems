class Solution {
    public int removeDuplicates(int[] nums) {
        int uni=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[uni++]=nums[i+1];
            }
        }
        return uni;
    }
}