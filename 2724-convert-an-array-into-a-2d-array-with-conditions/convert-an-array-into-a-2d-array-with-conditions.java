class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Map<Integer,Integer> count=new HashMap<>();
        for(int i:nums){
                count.put(i,count.getOrDefault(i,0)+1);
        }
       int maxRowCount = 0;
       for(Integer key: count.keySet()) {
           maxRowCount = Math.max(maxRowCount, count.get(key));
       }
       while(maxRowCount-- >0){
           List<Integer> arr=new ArrayList<>();
           l.add(arr);
       }
     
     count.clear();
     for(int n:nums){
         if(!count.containsKey(n)){
             count.put(n,1);
             l.get(0).add(n);
         }else{
              count.put(n,count.get(n)+1);
               l.get(count.get(n)-1).add(n);
         }
     }
        return l;
    }
}