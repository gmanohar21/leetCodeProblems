class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int unique=0;
        int t=0;
        for(int i:nums){
            if(i==0){
                if(unique<t) {
                    
                    unique=t;
                   
                }
                 t=0;
            }else{

            t++;
            }
           
        }
        return unique<t?t:unique;
    }
}