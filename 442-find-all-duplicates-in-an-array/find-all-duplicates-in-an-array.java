class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> track=new HashMap<>();
        for(int i:nums){
            if(track.containsKey(i)){
                track.put(i,track.get(i)+1);
            }else{
                track.put(i,1);
            }
        }
        List<Integer> ans=new ArrayList<>();
       for(Map.Entry<Integer,Integer> a:track.entrySet()){
        if(a.getValue()>1) ans.add(a.getKey());
       }
return ans;
    }
}