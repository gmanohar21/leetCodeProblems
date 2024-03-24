class Solution {
    public static int majority(int []nums){
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
                count++;
            } 
            else if( candidate==nums[i]) count++;
            else count--;
        }
        return candidate;

    }
    public int majorityElement(int[] nums) {
        return majority(nums);
    }
}