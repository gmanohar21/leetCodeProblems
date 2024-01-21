class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int idx=0;
        int max=-1;
        int c=0;
        for(int i:nums1){
            boolean ent = false;
            for(int j=0;j<nums2.length;j++){
                if(i==nums2[j]) idx=j;
            }
            for(int j=idx+1;j<nums2.length;j++){
                int no=nums2[idx];
                
                if(nums2[j]>no){
                    ans[c++]=nums2[j];
                    ent=true;
                    break;
                }
            }
            if(ent==false){
                ans[c++]=-1;
            }

        }
        return ans;
    }
}