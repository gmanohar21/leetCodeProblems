class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=nums.length;
        long freq=0,count=0;
        int start=0,end=0;
        int max=0;
        for(int i:nums) max=Math.max(max,i);
        while(end<l){
            if(nums[end]==max) freq++;
            while(freq==k){
                count=count+(l-end);
                if(nums[start]==max) freq--;
                start++;
            }
            end++;
        }
        return count;
    }
}