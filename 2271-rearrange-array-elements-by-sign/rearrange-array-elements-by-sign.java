class Solution {
    public int[] rearrangeArray(int[] nums) {
        int e=0,o=1;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a[e]=nums[i];
                e+=2;
            }else{
                a[o]=nums[i];
                o+=2;
            }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}