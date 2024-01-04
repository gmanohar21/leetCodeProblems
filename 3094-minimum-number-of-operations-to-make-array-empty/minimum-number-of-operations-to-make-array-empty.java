class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int opc=0;
        for(int i:nums)
        m.put(i,m.getOrDefault(i,0)+1);

  System.out.println(m);
         for(Integer key:m.keySet()){
         int val=m.get(key);
         if(val == 1) return -1;

         opc+=val/3;
         if(val%3!=0) opc++;
         }
       
         return opc;
    }
}