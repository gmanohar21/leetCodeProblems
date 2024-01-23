class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int ans[]=new int[2];
        int sum=0;
        int dup=0;
        for(int i=0;i<nums.length;i++){
           m.put(nums[i],m.getOrDefault(nums[i],0)+1);
           sum+=nums[i];
        }
        for(Map.Entry<Integer,Integer> me:m.entrySet()){
              System.out.println("dup");
            if(me.getValue()>1){
                 dup=me.getKey();
                 break;
            }
        }
        int n=nums.length;
        int sumofno=n*(n+1)/2;
        int anst=sum-dup;
        int a=sumofno-anst;
      
        ans[0]=dup;
        ans[1]=a;
        return ans;
    }
}