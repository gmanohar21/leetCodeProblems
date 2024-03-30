class Solution {
    private int findSubArrays(int[] nums, int k){
        int count = 0, left = 0, currCount = 0;
        int[] lookup = new int[nums.length + 1];
        
        for(int right = 0; right < nums.length; right++){
            int curr = nums[right];

            if(lookup[curr] == 0)currCount++;
            lookup[curr]++;

            while(currCount > k && left <= right){
                if(--lookup[nums[left++]] == 0) currCount--;
            }
            count += right - left + 1;
        }

        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findSubArrays(nums, k) - findSubArrays(nums, k-1);
    }
}