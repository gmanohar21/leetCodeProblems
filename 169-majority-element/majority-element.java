import java.util.Optional;
class Solution {
    public int majorityElement(int[] nums) {
        int mj =nums.length/2;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
         Optional<Integer> max=
       m.entrySet().stream()
                    .filter(t->t.getValue()>mj)
                    .map(Map.Entry::getKey)
                    .max(Integer::compareTo);
       
        return max.orElse(0);
    }
}