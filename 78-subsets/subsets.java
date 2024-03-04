class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> allsubsets=new ArrayList<>();
         List<Integer> tempsubset=new ArrayList<>();
         int s=0;
       
        backtrack(allsubsets,tempsubset,nums,s);
        return allsubsets;
    }
     public void backtrack( List<List<Integer>> allsubsets,
      List<Integer> tempsubset,
         int nums[],
         int s){
             allsubsets.add(new ArrayList<>(tempsubset));
             for(int i=s;i<nums.length;i++){
                 tempsubset.add(nums[i]);
                    backtrack(allsubsets,tempsubset,nums,i+1);
                  tempsubset.remove(tempsubset.size()-1);
             }


     }
}