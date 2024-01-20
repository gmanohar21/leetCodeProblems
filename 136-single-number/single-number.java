class Solution {
    public int singleNumber(int[] nums) {
       int ans=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> s:m.entrySet()){
           
                if(s.getValue()==1)
                    ans=s.getKey();
                 
        }
        return ans;
    }
}