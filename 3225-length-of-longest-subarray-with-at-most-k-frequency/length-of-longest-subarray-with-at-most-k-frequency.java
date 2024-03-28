class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int max=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            int v=nums[r];
                m.put(v,m.getOrDefault(v,0)+1);
                if(m.get(v)>k){
                    while(m.get(v)>k){
                        int lp=nums[l];
                        m.put(lp,m.get(lp)-1);
                        l++;
                    }
                }
                max=Math.max(max,r-l+1);
        }
       return max;
    }
}