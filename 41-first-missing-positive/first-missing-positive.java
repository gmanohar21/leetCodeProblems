class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,k=1;
        Arrays.sort(nums);
        while(i<nums.length){
            if(nums[i]==k) k++;
            i++;
        }
        return k;
    }
}

